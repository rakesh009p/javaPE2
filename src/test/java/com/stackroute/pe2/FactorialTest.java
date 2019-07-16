package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FactorialTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Before Class");
        Factorial factorial;
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After Class");
        factorial = null;
    }

  @Test
    public void givenIntegerInputShouldReturnSignedIntegerFactorialOutput(){
        //this method is to test the factorial of 32-bit signed integer
        //act

        String[] actualResult=factorial.factorialFunction(3);
        String[] array= {"factorial of 1 is 1","factorial of 2 is 2","factorial of 3 is 6"};
        //assert
      assertArrayEquals(array,actualResult);
    }
    @Test
    public void givenIntegerInputShouldReturnSignedIntegerFactorialOutput(){
        //this method is to test  the factorial of 32-bit signed integer
        //act

        String[] actualResult=factorial.factorialFunction(0);
        String[] array= {"factorial of 0 is 1"};
        //assert
        assertArrayEquals(array,actualResult);
    }
    @Test
    public void givenIntegerInputShouldReturnSignedIntegerFactorialOutput(){
        //this method is to test the factorial of 32-bit signed integer
        //act

        String[] actualResult=factorial.factorialFunction(21);
        String[] array= {"factorial of 21 is out of range"};
        //assert
        assertArrayEquals(array,actualResult);
    }


}