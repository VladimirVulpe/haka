package org.wahlzeit.location;

import junit.framework.Test;

public class AllTests {

	public AllTests() {
		public static Test suite() {
			TestSuite suite = new TestSuite();
			

			suite.addTestSuite(HakaPhotoTest.class);
			
			return suite;
		}
	}

}
