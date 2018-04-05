package com.ncsp.esb.amq.processors;

import com.ncsp.esb.amq.models.DAXMessage;


import org.apache.camel.*;
import org.apache.log4j.*;
import org.datacontract.schemas._2004._07.ncspintegration.PlanTableStatus;
import org.tempuri.DAXService;
import org.tempuri.IDAXService;
import org.tempuri.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SetWagonStatusProcessor implements Processor {
	final static Logger logger = Logger.getLogger(SetWagonStatusProcessor.class);
	
	public void process(Exchange exchange) throws Exception {
		Message msg = exchange.getIn();
		
		ObjectMapper mapper = new ObjectMapper();
		DAXMessage message = mapper.readValue(msg.getBody().toString(), DAXMessage.class);
		
		
		
		
		logger.info("This is info : " + message.wagonId);
		logger.warn("This is warn : " + message.operationDateTime.toString());
		logger.error("This is error : " + message.status.toString());
		logger.fatal("This is fatal : " + message.user);
		
		DAXService service = new DAXService();
		IDAXService iService = service.getBasicHttpBindingIDAXService();
		
		
		
		iService.setWagonStatus(message.wagonId, message.status, message.operationDateTime, message.comment, message.user);
		
	}
}
