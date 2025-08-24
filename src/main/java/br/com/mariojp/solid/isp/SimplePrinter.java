package br.com.mariojp.solid.isp;

public class SimplePrinter implements MultiFunctionDevice {
    @Override 
    public void print(String content){ 
    	/* imprime */
    	System.out.println("Teste de impressão.");
    }
    
    @Override 
    public void scan(String targetFile){ 
    	throw new UnsupportedOperationException("Sem scanner"); 
    }
}
