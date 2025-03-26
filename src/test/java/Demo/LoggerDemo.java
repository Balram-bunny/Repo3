package Demo;

import org.apache.logging.log4j.*;


public class LoggerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log=LogManager.getLogger("LoggerDemo");
		System.out.println("this is logger demo");
		log.info("for info only");
		log.debug("for debug");
		log.error("for error");
		log.warn("warning message");

	}

}
