package logging;

//import java.util.logging.LogManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogFourJ {


	private static Logger log = LogManager.getLogger(LogFourJ.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

       log.debug("i am debugging");
       log.error("object is not present");
       log.info("object is not present");
       log.fatal("this is fatal");
	}

}
