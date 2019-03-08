package ac.za.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheAddressTest {

    private TheAddress theAddress;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAdrs() {
        theAddress = new TheAddress("cnr Keizergracht & Tenant Str");

        String result = theAddress.getAdrs();
        Assert.assertEquals("cnr Keizergracht & Tenant Str",result);
    }
}