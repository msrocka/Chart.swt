package chart;

import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class LineChartExample {

	public static void main(String[] args) {
		setUpLogger();

		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Chart.swt | Line chart example");
		shell.setSize(600, 500);
		shell.setLayout(new FillLayout());
		Browser browser = new Browser(shell, SWT.NONE);

		LineConfig config = new LineConfig();
		config.width = 525;
		config.height = 400;
		new Chart(browser).lineChart(createData(), config);

		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) display.sleep();
		}
		display.dispose();
	}

	private static void setUpLogger() {
		Logger logger = Logger.getLogger(Chart.class.getName());
		logger.setLevel(Level.ALL);
		ConsoleHandler handler = new ConsoleHandler();
		handler.setLevel(Level.ALL);
		logger.addHandler(handler);
	}

	private static LineData createData() {
		LineData data = new LineData();

		// labels of the data points
		data.labels.addAll(Arrays.asList(
				"January", "February", "March", "April", "May", "June", "July"));

		// first data set
		LineDataSet ds1 = new LineDataSet();
		data.datasets.add(ds1);
		ds1.label = "My First dataset";
		ds1.fillColor = "rgba(220,220,220,0.2)";
		ds1.strokeColor = "rgba(220,220,220,1)";
		ds1.pointColor = "rgba(220,220,220,1)";
		ds1.pointStrokeColor = "#fff";
		ds1.pointHighlightFill = "#fff";
		ds1.pointHighlightStroke = "rgba(220,220,220,1)";
		ds1.data.addAll(Arrays.asList(65d, 59d, 80d, 81d, 56d, 55d, 40d));

		// second data set
		LineDataSet ds2 = new LineDataSet();
		data.datasets.add(ds2);
		ds2.label = "My Second dataset";
		ds2.fillColor = "rgba(151,187,205,0.2)";
		ds2.strokeColor = "rgba(151,187,205,1)";
		ds2.pointColor = "rgba(151,187,205,1)";
		ds2.pointStrokeColor = "#fff";
		ds2.pointHighlightFill = "#fff";
		ds2.pointHighlightStroke = "rgba(151,187,205,1)";
		ds2.data.addAll(Arrays.asList(28d, 48d, 40d, 19d, 86d, 27d, 90d));

		return data;
	}
}
