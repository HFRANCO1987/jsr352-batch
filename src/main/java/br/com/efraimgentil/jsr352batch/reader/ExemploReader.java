package br.com.efraimgentil.jsr352batch.reader;

import java.io.Serializable;

import javax.batch.api.chunk.AbstractItemReader;
import javax.inject.Named;

@Named
public class ExemploReader extends AbstractItemReader {
    
    int i = 0;
    
    @Override
    public void open(Serializable checkpoint) throws Exception {
        super.open(checkpoint);
        System.out.println("Será executado antes de iniciar a leitura");
    }
    
    @Override
    public Object readItem() throws Exception {
        if( i < 10){
            i++;
            return "Item " + i;
        }
        return null;
    }

}
