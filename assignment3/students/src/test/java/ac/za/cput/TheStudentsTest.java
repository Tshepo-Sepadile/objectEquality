package ac.za.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheStudentsTest {

    private TheStudents theStudents;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getStud() {
        theStudents = new TheStudents(30000);
        int result = theStudents.getStud();
        Assert.assertEquals(30000, result);
    }
}