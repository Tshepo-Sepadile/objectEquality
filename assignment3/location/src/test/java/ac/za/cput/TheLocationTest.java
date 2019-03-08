package ac.za.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheLocationTest {

    private TheLocation theLoc;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getLoc() {
        theLoc = new TheLocation("Cape Town");
        String result = theLoc.getLoc();
        Assert.assertEquals("Cape Town", result);
    }
}