package chart;

import java.util.Arrays;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;

public class BarChartExample {

	public static void main(String[] args) {
		Examples.withShell(shell -> {
			shell.setText("Chart.swt | Bar chart example");
			Browser browser = new Browser(shell, SWT.NONE);
			BarConfig config = new BarConfig();
			config.width = 525;
			config.height = 400;
			new Chart(browser).bar(createData(), config);
		});
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
