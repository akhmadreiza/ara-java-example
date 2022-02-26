package com.akhmadreiza.unittestexample;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

    //Apabila dimasukkan value string normal, method akan return false.
    @Test
    public void testStringNotEmpty() {
        //prepare test data
        String strToTest = "test string not empty";

        //do test
        boolean isEmpty = StringUtils.isEmpty(strToTest);

        //assertion
        Assert.assertFalse(isEmpty);
    }

    //Apabila dimasukkan string kosong, method akan return true.
    @Test
    public void testStringEmpty() {
        //prepare test data
        String strToTest = "";

        //do test
        boolean isEmpty = StringUtils.isEmpty(strToTest);

        //assertion
        Assert.assertTrue(isEmpty);
    }

    //Apabila dimasukkan null, method akan return true.
    @Test
    public void testStringNull() {
        //prepare test data
        String strToTest = null;

        //do test
        boolean isEmpty = StringUtils.isEmpty(strToTest);

        //assertion
        Assert.assertTrue(isEmpty);
    }
}
