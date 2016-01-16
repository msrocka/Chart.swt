package chart;

import java.util.function.Consumer;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Examples {

	private Examples() {
	}

	public static void withShell(Consumer<Shell> fn) {
		setUpLogger();
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Chart.swt | Bar chart example");
		shell.setSize(600, 500);
		shell.setLayout(new FillLayout());
		fn.accept(shell);
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

}
