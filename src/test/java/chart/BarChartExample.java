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

public class BarChartExample {

	public static void main(String[] args) {
		setUpLogger();

		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Chart.swt | Bar chart example");
		shell.setSize(600, 500);
		shell.setLayout(new FillLayout());
		Browser browser = new Browser(shell, SWT.NONE);

		BarConfig config = new BarConfig();
		config.width = 525;
		config.height = 400;
		new Chart(browser).barChart(createData(), config);

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

	private static BarData createData() {
		BarData data = new BarData();

		// labels of the data points
		data.labels.addAll(Arrays.asList(
				"January", "February", "March", "April", "May", "June", "July"));

		// first data set
		BarDataSet ds1 = new BarDataSet();
		data.datasets.add(ds1);
		ds1.label = "My First dataset";
		ds1.fillColor = "rgba(220,220,220,0.5)";
		ds1.strokeColor = "rgba(220,220,220,0.8)";
		ds1.highlightFill = "rgba(220,220,220,0.75)";
		ds1.highlightStroke = "rgba(220,220,220,1)";
		ds1.data.addAll(Arrays.asList(65d, 59d, 80d, 81d, 56d, 55d, 40d));

		// second data set
		BarDataSet ds2 = new BarDataSet();
		data.datasets.add(ds2);
		ds2.label = "My Second dataset";
		ds2.fillColor = "rgba(151,187,205,0.5)";
		ds2.strokeColor = "rgba(151,187,205,0.8)";
		ds2.highlightFill = "rgba(151,187,205,0.75)";
		ds2.highlightStroke = "rgba(151,187,205,1)";
		ds2.data.addAll(Arrays.asList(28d, 48d, 40d, 19d, 86d, 27d, 90d));

		return data;
	}

}
