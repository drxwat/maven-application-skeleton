package su.loboda.sand_deamon_loger;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);;

	public static void main(String[] args) {
		
		LOGGER.trace("Entering application.");
		App obj = new App();
		
		LOGGER.info("Info message.");
		LOGGER.error("Error message.");
		
		
		System.out.println("Unique ID :" + obj.generateUniqueKey());
		
		LOGGER.trace("Starting testing XLoger with Bar.");
		
		Bar bar = new Bar();
		bar.retrieveMessage();
		bar.retrieveMessage();
		bar.exampleException();
		
		LOGGER.trace("Ending testing XLoger with Bar.");
		
		LOGGER.trace("Exiting application.");
	}

	public String generateUniqueKey() {

		String id = UUID.randomUUID().toString();
		return id;
	}
}
