package Log4J;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Before;
import org.junit.Test;

public class Basetest {
	
	Logger log = Logger.getLogger(Basetest.class);
	
	
	
	@Before
	public void start() {
		DOMConfigurator.configure("log4j.xml");
		log.info("any Commit");
	}
	
	@Test
	public void test1() {
		
		log.fatal("The is FATAL");
		log.error("this is error");
		log.warn("this is warn");
		log.info("This is info");
		
		
	}

}
