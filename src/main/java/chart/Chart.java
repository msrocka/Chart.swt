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

	public void lineChart(LineData data, LineConfig options) {
		touchJsFile();
		Gson gson = new Gson();
		String dataJson = gson.toJson(data);
		String config = gson.toJson(options);
		createHtml(dataJson, config, "Line");
	}

	public void barChart(BarData data, BarConfig options) {
		touchJsFile();
		Gson gson = new Gson();
		String dataJson = gson.toJson(data);
		String config = gson.toJson(options);
		createHtml(dataJson, config, "Bar");
	}

	private void createHtml(String dataJson, String config, String type) {
		log.finest("create chart of type " + type);
		try {
			InputStream is = getClass().getResourceAsStream("template.html");
			String html = new Scanner(is, "UTF-8").useDelimiter("\\A").next();
			html = html.replace("{{config}}", config)
					.replace("{{data}}", dataJson)
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
