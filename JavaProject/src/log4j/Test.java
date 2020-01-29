package log4j;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Test {

	static Logger log = Logger.getLogger(Test.class.getName());
	public static void main(String[] args) {
		
		//PropertyConfigurator.configure("log4j.properties");
	
		log.debug("Debug");
	      log.info("Info");
	}

}
