package loanapplication.javaproject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class log {

	
	private static Logger l=(Logger) LogManager.getLogger(log.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		l.debug("I am failed");
		l.error("fail");
		l.fatal("test");
		l.info("printed");

	}

}
