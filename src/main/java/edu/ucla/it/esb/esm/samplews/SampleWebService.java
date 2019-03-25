package edu.ucla.it.esb.esm.samplews;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://samplews.esm.esb.it.ucla.edu/wsdl/HelloWorld/", name = "HelloWorld", serviceName = "HelloWorld", portName = "SOAPOverHTTP"

)
public class SampleWebService implements HelloWorld {

	private long delay;

	/**
	 * @param delayResponse
	 *            the delayResponse to set
	 */
	public void setDelayResponse(boolean delayResponse) {
	}

	/**
	 * @param delay
	 *            the delay to set
	 */
	public void setDelay(long delay) {
		this.delay = delay;
	}

	@WebMethod
	public String sayHi() throws InterruptedException {
		//Thread.sleep(10000000000l);
		return "Hello ";
	}

	@WebMethod
	public String bye() {

		return "bye ";

	}

	@WebMethod
	public String echo() {

		return "echo ";

	}

}