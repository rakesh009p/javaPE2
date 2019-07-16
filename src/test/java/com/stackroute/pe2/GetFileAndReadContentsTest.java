package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetFileAndReadContentsTest {
    GetFileAndReadContents getFileAndReadContents;

    @Before
    public void setUp() throws Exception {
        System.out.println("Before Class");
        GetFileAndReadContents getFileAndReadContents = new GetFileAndReadContents();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After Class");
    }

    @Test
    //test is get the extension file and should read the contents
    public void givenInputTextFileShouldReadTheContent() {

        //act
        int fileLength = 50;
        String filePath = "/home/cgi/IdeaProjects/javaExercisePE2/src/test/java/com/stackroute/pe2/testFile.txt";

        String actualresult = this.getFileAndReadContents.readContent(filePath);

        //assert

        assertEquals(fileLength, actualresult);
    }


}

