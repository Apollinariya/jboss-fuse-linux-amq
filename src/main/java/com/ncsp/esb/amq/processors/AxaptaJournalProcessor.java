package com.ncsp.esb.amq.processors;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.jms.Connection;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.qpid.jms.JmsConnectionFactory;

import com.ncsp.esb.database.Db;
import com.ncsp.esb.amq.models.JournalRecord;

public class AxaptaJournalProcessor implements Processor {
	public void process(Exchange exchange) throws Exception {		
		try {
			JmsConnectionFactory factory = new JmsConnectionFactory("amqp://10.1.15.228:5672");
			Connection connection = factory.createConnection("admin", "admin");
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			Queue queue = session.createQueue("testQueue");
			
			MessageProducer messageProducer = session.createProducer(queue);
							
			ArrayList<JournalRecord> journalRecords = Db.select("SELECT * From TestJournal WHERE State=0", (u) -> { 
				JournalRecord record = new JournalRecord();
				try {
					record.Id = u.getInt("Id");
					record.Body = u.getString("Body");
					record.Topic = u.getString("Topic");
					record.State = u.getBoolean("State");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return record;
			});
		    
            for (int i = 0; i < journalRecords.size(); i++) {
			    System.out.println("Body: " + journalRecords.get(i).Body);
                TextMessage message = session.createTextMessage(journalRecords.get(i).Body);
                message.setStringProperty("topic", journalRecords.get(i).Topic);
                messageProducer.send(message);
            }
	        
			session.close();
	        connection.close();
		} catch (Exception exp) {
	        System.out.println("Caught exception, exiting.");
	        exp.printStackTrace();
	        }
	}
}