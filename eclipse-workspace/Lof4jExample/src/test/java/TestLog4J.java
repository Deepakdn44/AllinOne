import org.apache.log4j.Logger;

public class TestLog4J {
	
	static Logger log = Logger.getLogger(TestLog4J.class);
	public static void main(String[] args) {
		
		log.debug("This is a debug log");
		log.info("This is a info log");
		log.error("This is a error log");
		
	}

	
}
