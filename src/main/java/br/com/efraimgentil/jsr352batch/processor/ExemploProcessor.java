package br.com.efraimgentil.jsr352batch.processor;

import javax.batch.api.chunk.ItemProcessor;
import javax.inject.Named;

@Named
public class ExemploProcessor implements ItemProcessor {
    
    @Override
    public Object processItem(Object item) throws Exception {
        System.out.println("Ira executar o item " + item );
        return item;
    }
    
}
