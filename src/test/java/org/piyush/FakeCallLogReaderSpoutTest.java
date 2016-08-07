package org.piyush;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple FakeCallLogReaderSpout.
 */
public class FakeCallLogReaderSpoutTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public FakeCallLogReaderSpoutTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(FakeCallLogReaderSpoutTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }
}
