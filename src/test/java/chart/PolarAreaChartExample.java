package chart;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;

public class PolarAreaChartExample {

	public static void main(String[] args) {
		Examples.withShell(shell -> {
			Browser browser = new Browser(shell, SWT.NONE);
			PolarAreaConfig config = new PolarAreaConfig();
			config.width = 525;
			config.height = 400;
			new Chart(browser).polarArea(createData(), config);
		});
	}

	private static List<PolarAreaItem> createData() {
		List<PolarAreaItem> data = new ArrayList<>();

		PolarAreaItem i1 = new PolarAreaItem();
		data.add(i1);
		i1.value = 300;
		i1.color = "#F7464A";
		i1.highlight = "#FF5A5E";
		i1.label = "Red";

		PolarAreaItem i2 = new PolarAreaItem();
		data.add(i2);
		i2.value = 50;
		i2.color = "#46BFBD";
		i2.highlight = "#5AD3D1";
		i2.label = "Green";

		PolarAreaItem i3 = new PolarAreaItem();
		data.add(i3);
		i3.value = 100;
		i3.color = "#FDB45C";
		i3.highlight = "#FFC870";
		i3.label = "Yellow";

		PolarAreaItem i4 = new PolarAreaItem();
		data.add(i4);
		i4.value = 40;
		i4.color = "#949FB1";
		i4.highlight = "#A8B3C5";
		i4.label = "Grey";

		PolarAreaItem i5 = new PolarAreaItem();
		data.add(i5);
		i5.value = 120;
		i5.color = "#4D5360";
		i5.highlight = "#616774";
		i5.label = "Dark Grey";

		return data;
	}

}