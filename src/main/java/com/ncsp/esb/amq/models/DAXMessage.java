package com.ncsp.esb.amq.models;

import javax.xml.datatype.XMLGregorianCalendar;

import org.datacontract.schemas._2004._07.ncspintegration.PlanTableStatus;


public class DAXMessage {
	public String wagonId;
	public PlanTableStatus status;
	public XMLGregorianCalendar operationDateTime;
	public String comment;
	public String user;
}