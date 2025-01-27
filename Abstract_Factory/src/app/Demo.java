package app;

import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application app = configureApplication();
        app.paint();
	}

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }
}
