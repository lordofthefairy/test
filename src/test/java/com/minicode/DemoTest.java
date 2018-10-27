package com.minicode;

import junit.framework.TestCase;

public class DemoTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testPrintFizzBuzz() {
		Demo demo=new Demo();
		 assertEquals(0, demo.printFizzBuzz());
	}

}
