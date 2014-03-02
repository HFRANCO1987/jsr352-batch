package br.com.efraimgentil.jsr352batch.writer;

import java.util.List;

import javax.batch.api.chunk.AbstractItemWriter;
import javax.inject.Named;

@Named
public class ExemploWriter extends AbstractItemWriter {
    
    @Override
    public void writeItems(List<Object> itens) throws Exception {
        for (Object object : itens) {
            System.out.println("Exemplo: " + object );
        }
    }

}
