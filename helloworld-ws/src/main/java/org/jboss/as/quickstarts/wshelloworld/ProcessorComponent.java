package org.jboss.as.quickstarts.wshelloworld;

import java.util.logging.Logger;

import javax.inject.Named;

@Named("processor")
public class ProcessorComponent {
	
	private Logger LOG = Logger.getLogger(ProcessorComponent.class.getName());

	public String longTermProcess(int time) {
    	LOG.info("Delegated long process starting...");
    	String message = "Delegated process completed in " + time + " millisencond";
    	try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			message = "Sleep interrupted!";
		}
    	LOG.info(message);
    	return message;
	}
}
