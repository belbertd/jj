/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author netphenix
 */
public class HelloWorldTest {

    /**
     * unit test for formMessage method.
     */
    @Test
    public void testFormMessage() {
        //Asserts that two Strings are equal                
        String expResult = "Hello World";
        String result = "Hello World";
        System.out.println("* HelloWorldTest: test method 1 testFormMessage()");
        Assert.assertEquals(expResult, result);

        
    }
}
