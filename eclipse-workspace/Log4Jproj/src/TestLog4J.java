import org.apache.log4j.Logger;

public class TestLog4J {
	
	static Logger logg = Logger.getLogger(TestLog4J.class);

	public static void main(String[] args) {
		logg.debug("This is debug log");
		logg.info("This is info log");
		logg.error("Error in a project");
		

	}

}
