package br.com.efraimgentil.jsr352batch.processor;

import javax.batch.api.chunk.ItemProcessor;
import javax.inject.Named;

@Named
public class MailProcessor implements ItemProcessor {

	@Override
	public Object processItem(Object item) throws Exception {
		String email = String.valueOf(item);
		System.out.println( "Enviando email para " + email);
		return "Email enviado com sucesso para " + email;
	}

}