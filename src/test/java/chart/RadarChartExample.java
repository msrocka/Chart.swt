package chart;

import java.util.Arrays;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;

public class RadarChartExample {

	public static void main(String[] args) {
		Examples.withShell(shell -> {
			Browser browser = new Browser(shell, SWT.NONE);
			RadarConfig config = new RadarConfig();
			config.width = 525;
			config.height = 400;
			new Chart(browser).radar(createData(), config);
		});
	}

	private static RadarData createData() {
		RadarData data = new RadarData();

		// labels of the data points
		data.labels.addAll(Arrays.asList(
				"Eating", "Drinking", "Sleeping", "Designing", "Coding", "Cycling", "Running"));

		// first data set
		RadarDataSet ds1 = new RadarDataSet();
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
		RadarDataSet ds2 = new RadarDataSet();
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
