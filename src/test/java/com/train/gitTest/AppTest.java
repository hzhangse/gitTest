package com.train.gitTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the dtest case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	 System.out.println("version BBBBBBB");
    	 System.out.println("version B");
    	 System.out.println("version 1");
        assertTrue( true );
        System.out.println("version 2");
        System.out.println("version 2");
        System.out.println("version 2");
    }
}
