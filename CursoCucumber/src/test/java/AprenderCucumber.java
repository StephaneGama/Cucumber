import org.junit.Assert;

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
    	
    	
    	private int contador = 0;
    	
    	@Dado("^que o valor do contador é (\\d+)$")
    	public void queOValorDoContadorÉ(int arg1) throws Throwable {
    		contador = arg1;
 
    	}

    	@Quando("^eu incrementar em (\\d+)$")
    	public void euIncrementarEm(int arg1) throws Throwable {
    	    contador = contador + arg1;
    	}

    	@Então("^o valor do contador será (\\d+)$")
    	public void oValorDoContadorSerá(int arg1) throws Throwable {
    	    Assert.assertEquals(arg1, contador);
    	   // throw new RuntimeException();
    	    
    	    
    	}

    }


