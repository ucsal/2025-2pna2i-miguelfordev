import br.com.mariojp.solid.isp.*;

public class Main {
	public static void main(String[] args) {
		OfficeService svc = new OfficeService(new SimplePrinter());
		// Estado inicial: vai lançar UnsupportedOperationException por causa do scan
		// desnecessário
		svc.printReport("Relatório do Dia");
		
		WorkService svc2 = new WorkService(new MultiPrinter());
		svc2.printReport("Relatório do Dia 2");
	}
}
