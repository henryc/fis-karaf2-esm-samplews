package edu.ucla.it.esb.esm.samplews;

import javax.jws.WebMethod;
import javax.jws.WebService;



@WebService(
		  targetNamespace = "http://samplews.esm.esb.it.ucla.edu/wsdl/HelloWorld/",
		  name = "HelloWorld"
)
public interface HelloWorld {     
	@WebMethod
	String sayHi() throws InterruptedException;  
	
	@WebMethod
	String bye(); 
	
	@WebMethod
	String echo();
}