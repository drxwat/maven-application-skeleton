package su.loboda;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;

public class App {

	public static final XLogger LOGGER = XLoggerFactory.getXLogger(App.class);

	public static void main(String[] args) {
		LOGGER.info("Application started.");

	}

}
