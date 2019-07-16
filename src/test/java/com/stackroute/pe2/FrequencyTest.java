package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FrequencyTest {
    Frequency frequency;
    @Before
    public void setUp() throws Exception {
        System.out.println("Before Class");
        Frequency frequency =new Frequency();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After Class");
        frequency=null;

    }
    @Test
    //test is check the frequency of a word in string
            public void givenStringShouldReturnString(){
    //arrange
    //act

    String actualResult = frequency.frequencyCount("dont trouble the trouble");
    //assert
        assertEquals("dont-1,the-1,trouble-2",actualResult);

}
    @Test

    public void givenStringAsNullShouldReturnErrorMessage() {
        //test is to throw error for a null inputi

        //arrange

        //act
        String actualresult=frequency.frequencyCount(null);
        //assert
        assertNotNull(actualresult);
        assertEquals("Should Not Be Null", actualresult);

    }
}