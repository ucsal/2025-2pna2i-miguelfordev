package br.com.mariojp.solid.isp;

public class WorkService {

	private final MultiFunctionDevice device;
    
    public WorkService(MultiFunctionDevice device){ 
    	this.device = device;
    }
    
    public void printReport(String content){
        device.print(content);
        device.scan("audit.txt");
    }
}
