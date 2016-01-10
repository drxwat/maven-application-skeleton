package su.loboda.sand_deamon_loger;

import java.util.Random;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;

public class Bar {
	private static final XLogger LOGGER = XLoggerFactory.getXLogger(Bar.class);

	private String[] messages = new String[] { "Hello, World", "Goodbye Cruel World", "You had me at hello" };

	private Random rand = new Random(1);

	public String retrieveMessage() {
		LOGGER.entry();

		String testMsg = getMessage(getKey());

		LOGGER.exit();
		return testMsg;
	}

	public void exampleException() {
		LOGGER.entry();
		try {
			String msg = messages[messages.length];
			LOGGER.error("An exception should have been thrown.");
		} catch (Exception ex) {
			LOGGER.catching(ex);
		}
		LOGGER.exit();
	}

	public String getMessage(int key) {
		LOGGER.entry(key);

		String value = messages[key];

		LOGGER.exit(value);
		return value;
	}

	private int getKey() {
		LOGGER.entry();
		int key = rand.nextInt(messages.length);
		LOGGER.exit(key);
		return key;
	}

}
