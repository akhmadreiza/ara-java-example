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

    //Apabila dimasukkan kata-kata dengan spasi, maka akan return array sebanyak kata yang
    //dipisahkan dengan spasi
    @Test
    public void testStringInputSplit() {
        //prepare data
        String inputString = "saya membuat unit test";

        //do test
        String[] actual = StringUtils.splitString(inputString);

        //assertion
        //assert length dari array actual adalah 4
        System.out.println("input string length = " + actual.length);
        Assert.assertEquals(4, actual.length);

        //assert index 0 dari array actual adalah "saya"
        System.out.println("actual[0] = " + actual[0]);
        Assert.assertEquals("saya", actual[0]);

        //assert index 1 dari array actual adalah "membuat"
        System.out.println("actual[1] = " + actual[1]);
        Assert.assertEquals("membuat", actual[1]);
    }

    @Test
    public void testInputNullSplitString() {
        //apabila method di input null, maka akan throw null pointer exception (NPE)

        //prepare data
        String input = null;

        //do test
        try {
            String[] actual = StringUtils.splitString(input);
        } catch (Exception e) {
            Assert.assertTrue(e instanceof IllegalStateException);
            IllegalStateException ie = (IllegalStateException) e;
            Assert.assertEquals("input string cannot be null", ie.getMessage());
        }
    }

    @Test
    public void testInputEmptyStringSplitString() {
        //apabila method di input null, maka akan throw null pointer exception (NPE)

        //prepare data
        String input = "";

        //do test
        try {
            String[] actual = StringUtils.splitString(input);
        } catch (Exception e) {
            Assert.assertTrue(e instanceof IllegalStateException);
            IllegalStateException ie = (IllegalStateException) e;
            Assert.assertEquals("input string cannot be null", ie.getMessage());
        }
    }
}
