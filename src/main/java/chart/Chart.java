package chart;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.google.gson.Gson;
import org.eclipse.swt.browser.Browser;

public class Chart {

	private Logger log = Logger.getLogger(getClass().getName());

	private Browser browser;
	private List<String> createdFiles = new ArrayList<>();

	public Chart(Browser browser) {
		this.browser = browser;
		if (!browser.getJavascriptEnabled()) {
			log.finest("try to enable JS in browser");
			browser.setJavascriptEnabled(true);
		}
		browser.addDisposeListener(e -> deleteFiles());
	}

	public void line(LineData data, LineConfig options) {
		createChart(data, options, "Line");
	}

	public void bar(BarData data, BarConfig options) {
		createChart(data, options, "Bar");
	}

	public void radar(RadarData data, RadarConfig options) {
		createChart(data, options, "Radar");
	}

	public void polarArea(List<PolarAreaItem> data, PolarAreaConfig options) {
		createChart(data, options, "PolarArea");
	}

	private void createChart(Object dataObj, Object configObj, String type) {
		log.finest("create chart of type " + type);
		try {
			touchJsFile();
			Gson gson = new Gson();
			String data = gson.toJson(dataObj);
			String config = gson.toJson(configObj);
			InputStream is = getClass().getResourceAsStream("template.html");
			String html = new Scanner(is, "UTF-8").useDelimiter("\\A").next();
			html = html.replace("{{config}}", config)
					.replace("{{data}}", data)
					.replace("{{chartType}}", type);
			Path path = Files.createTempFile("chart.swt_", ".html");
			Files.write(path, html.getBytes("utf-8"));
			createdFiles.add(path.toString());
			String url = path.toUri().toURL().toString();
			log.fine(() -> "created temp. HTML file: " + path);
			browser.setUrl(url);
		} catch (Exception e) {
			log.log(Level.SEVERE, "failed to create html file", e);
		}
	}

	private void touchJsFile() {
		String f = "Chart.min.js";
		try {
			Path path = Paths.get(System.getProperty("java.io.tmpdir"), f);
			if (!Files.exists(path)) {
				InputStream is = this.getClass().getResourceAsStream(f);
				Files.copy(is, path);
				log.fine(() -> "created " + path);
			}
		} catch (Exception e) {
			log.log(Level.SEVERE, "Could not write temp. file " + f, e);
		}
	}

	private void deleteFiles() {
		try {
			for (String s : createdFiles) {
				Path path = Paths.get(s);
				Files.delete(path);
				log.fine("deleted temp. HTML file " + path);
			}
		} catch (Exception e) {
			log.log(Level.SEVERE, "Failed to delete file", e);
		}
	}
}
