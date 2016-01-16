package chart;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;

public class DoughnutChartExample {

	public static void main(String[] args) {
		Examples.withShell(shell -> {
			shell.setText("Chart.swt | Doughnut chart example");
			Browser browser = new Browser(shell, SWT.NONE);
			PieConfig config = new PieConfig();
			config.width = 525;
			config.height = 400;
			config.percentageInnerCutout = 50;
			new Chart(browser).doughnut(createData(), config);
		});
	}

	private static List<Item> createData() {
		List<Item> data = new ArrayList<>();

		Item i1 = new Item();
		data.add(i1);
		i1.value = 300;
		i1.color = "#F7464A";
		i1.highlight = "#FF5A5E";
		i1.label = "Red";

		Item i2 = new Item();
		data.add(i2);
		i2.value = 50;
		i2.color = "#46BFBD";
		i2.highlight = "#5AD3D1";
		i2.label = "Green";

		Item i3 = new Item();
		data.add(i3);
		i3.value = 100;
		i3.color = "#FDB45C";
		i3.highlight = "#FFC870";
		i3.label = "Yellow";

		Item i4 = new Item();
		data.add(i4);
		i4.value = 40;
		i4.color = "#949FB1";
		i4.highlight = "#A8B3C5";
		i4.label = "Grey";

		Item i5 = new Item();
		data.add(i5);
		i5.value = 120;
		i5.color = "#4D5360";
		i5.highlight = "#616774";
		i5.label = "Dark Grey";

		return data;
	}
}
