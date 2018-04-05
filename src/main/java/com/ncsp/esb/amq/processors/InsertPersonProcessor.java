package com.ncsp.esb.amq.processors;

import com.ncsp.esb.amq.models.Person;

import org.apache.camel.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ncsp.esb.database.*;

public class InsertPersonProcessor implements Processor {
	public void process(Exchange exchange) throws Exception {
		Message msg = exchange.getIn();
		
		ObjectMapper mapper = new ObjectMapper();
		Person person = mapper.readValue(msg.getBody().toString(), Person.class);
		
		System.out.println(String.format("Message body: Id = %d, Name = %s, Age = %d", person.Id, person.Name, person.Age));
		Db.execSql(String.format("INSERT INTO Persons (Name, Age) VALUES ('%s', %d)", person.Name, person.Age));
	}
}