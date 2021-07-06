import cucumber.api.java.en.*;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

     
    public class AprenderCucumber {
    	
    	@Dado("^criar arquivo$")
    	public void criarArquivo() throws Throwable {
    		System.out.println("Qualquer coisa1");
    	}

    	@Quando("^executalo$")
    	public void executalo() throws Throwable {
    		System.out.println("Qualquer coisa2");
    	}

    	@Então("^finalizar$")
    	public void finalizar() throws Throwable {
    		System.out.println("Qualquer coisa3");
    	}  
    }


