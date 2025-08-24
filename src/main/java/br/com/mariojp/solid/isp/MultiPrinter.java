package br.com.mariojp.solid.isp;

public class MultiPrinter implements MultiFunctionDevice{

	public void print(String content) {
		System.out.println("Teste de impressão Multiprinter");
		
	}

	public void scan(String targetFile) {
		System.out.println("Teste de scan Multiprinter");
		
	}
}
