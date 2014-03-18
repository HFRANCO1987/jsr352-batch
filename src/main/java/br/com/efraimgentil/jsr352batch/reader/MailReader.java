package br.com.efraimgentil.jsr352batch.reader;

import java.util.Queue;
import java.util.concurrent.LinkedTransferQueue;

import javax.batch.api.chunk.AbstractItemReader;
import javax.inject.Named;

@Named
public class MailReader extends AbstractItemReader {
	
	private Queue<String> emails;
	
	public MailReader() {
		emails.add("email1@gmail.com");
		emails.add("email2@gmail.com");
		emails.add("email3@gmail.com");
		emails.add("email4@gmail.com");
	}
	
    @Override
    public Object readItem() throws Exception {
        return getEmailParaEnvio();
    }
    
    private String getEmailParaEnvio(){
    	return emails.poll();
    }
    
}
