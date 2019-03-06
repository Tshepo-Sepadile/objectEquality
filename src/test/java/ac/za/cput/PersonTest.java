package ac.za.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    public Person person;
    public People people;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void equals() {

        person = new Person("Rainbow");
        boolean result = person.equals(people);
        Assert.assertEquals(false, result);

    }
}