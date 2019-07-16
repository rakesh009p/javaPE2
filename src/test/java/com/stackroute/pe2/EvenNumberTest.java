package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenNumberTest {

      EvenNumber evenNumber;

        @Before
        public void setUp() throws Exception {
            System.out.println("Before Class");

            EvenNumber evenNumber=new EvenNumber();
        }

        @After
        public void tearDown() throws Exception {
            System.out.println("After Class");
            evenNumbber=null;
        }

        @Test
        //test is to check the given integer is even
        public void givenIntShouldReturnBooleanEven(){
            //arrange

            //act
            boolean actualResult=evenNumber.evenNumberCheck(22);
            //assert
            assertEquals("true",actualResult);

        }
        @Test
        //test is check the given integer is odd
        public void givenIntegerShouldReturnBooleanOdd(){
            //arrange

            //act
            boolean actualResult=evenNumber.evenNumberCheck(23);
            //assert
            assertEquals("false",actualResult);

        }
    @Test
    //test is check the given negative integer is odd
    public void givenIntegerShouldReturnBooleanOdd(){
        //arrange

        //act
        boolean actualResult=evenNumber.evenNumberCheck(-23);
        //assert
        assertEquals("false",actualResult);

    }
    }

