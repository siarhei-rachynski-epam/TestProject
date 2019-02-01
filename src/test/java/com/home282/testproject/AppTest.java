package com.home282.testproject;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import com.home282.testproject.App;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testAppConstructor() {
        try {
            new App();
        } catch (Exception e) {
            Assert.fail("Construction failed.");
        }
    }

    @Test
    public void testAppMainOutputShouldBeHelloWorld() {
        App.main(null);
        Assert.assertEquals("Output should be \"Hello World!\"","Hello World!" + System.getProperty("line.separator"), outContent.toString());
        // uncomment to fail the test
        // Assert.assertEquals("Output should be \"Hello World!\"","Hello World!", outContent.toString());
    }

    @Ignore("Default test is ignored")
    @Test
    public void testAppMain() {
        App.main(null);
        try {
            Assert.assertEquals("Hello World!" + System.getProperty("line.separator"), outContent.toString());
        } catch (AssertionError e) {
            Assert.fail("\"message\" is not \"Hello World!\"");
        }
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
