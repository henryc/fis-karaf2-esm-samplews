package edu.ucla.it.esb.esm.samplews;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import edu.ucla.it.esb.esm.samplews.HelloWorld;


@RunWith(MockitoJUnitRunner.class)
public class SampleWsTest {
	
	  @Mock
	  private HelloWorld helloWorld;
	  
	  @Test
	  public void testCall() throws InterruptedException{
		 
		  String  resp = helloWorld.sayHi();
		 // assert(resp.equalsIgnoreCase("Hello"));
		  
	  }



}
