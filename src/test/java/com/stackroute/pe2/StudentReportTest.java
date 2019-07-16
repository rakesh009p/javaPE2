package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentReportTest {
    StudentReport studentReport;

    @Before
    public void setUp() throws Exception {

        StudentReport studentReport=new StudentReport();
    }

    @After
    public void tearDown() throws Exception {
        studentReport=null;
    }
    @Test
    //test to find the average of a given inputs
    public void givenInputIntegerShouldReturnIntegr(){
        int[] arr={88,89,90,91};
        String[] actualResult=studentReport.StudentScore(arr);
        double avg=89.5;

        //assert
        assertEquals(avg,actualResult);


    }
    @Test
    //test to find the maximum of a given inputs
    public void givenInputIntegerShouldReturnIntegr(){
        int[] arr={88,89,90,91};
        String[] actualResult=studentReport.StudentScore(arr);
        double max=91;

        //assert
        assertEquals(max,actualResult);


    }
    @Test
    //test to find the minimum of a given inputs
    public void givenInputIntegerShouldReturnIntegr(){
        int[] arr={88,89,90,91};
        String[] actualResult=studentReport.StudentScore(arr);
        double min=88;

        //assert
        assertEquals(min,actualResult);


    }


}