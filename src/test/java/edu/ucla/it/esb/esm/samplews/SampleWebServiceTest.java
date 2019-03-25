/**
 * 
 */
package edu.ucla.it.esb.esm.samplews;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author RDarji
 *
 */
public class SampleWebServiceTest {

	/**
	 * Test method for
	 * {@link edu.ucla.it.esb.esm.samplews.SampleWebService#setDelayResponse(boolean)}
	 * .
	 */

	private SampleWebService sampleWebService = new SampleWebService();


	@Test
	public void testSetDelayResponse() {
		try {
			sampleWebService.setDelayResponse(true);
		} catch (Exception e) {
			fail("ERROR while setting delay response>>>");
		}
	}

	/**
	 * Test method for
	 * {@link edu.ucla.it.esb.esm.samplews.SampleWebService#setDelay(long)}.
	 */
	@Test
	public void testSetDelay() {
		try {
			sampleWebService.setDelay(10000000L);
		} catch (Exception e) {
			fail("ERROR while setting delay>>>");
		}
	}

	/**
	 * Test method for
	 * {@link edu.ucla.it.esb.esm.samplews.SampleWebService#sayHi()}.
	 */
	@Test
	public void testSayHi() {
		try {
			sampleWebService.sayHi();
		} catch (Exception e) {
			fail("ERROR while getting response>>>");
		}
	}

	/**
	 * Test method for
	 * {@link edu.ucla.it.esb.esm.samplews.SampleWebService#bye()}.
	 */
	@Test
	public void testBye() {
		try {
			sampleWebService.bye();
		} catch (Exception e) {
			fail("ERROR while getting response>>>");
		}
	}

	/**
	 * Test method for
	 * {@link edu.ucla.it.esb.esm.samplews.SampleWebService#echo()}.
	 */
	@Test
	public void testEcho() {
		try {
			sampleWebService.echo();
		} catch (Exception e) {
			fail("ERROR while getting response>>>");
		}
	}

}
