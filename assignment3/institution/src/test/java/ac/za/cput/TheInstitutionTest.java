package ac.za.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheInstitutionTest {
    private TheInstitution institution;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void varsityDetails() {
        TheAddress myAddress = new TheAddress("cnr Keizergracht & Tenant Str");
        String result1 = myAddress.getAdrs();
        TheLocation myInstitution = new TheLocation("Cape Town");
        String result2 = myInstitution.getLoc();
        TheStudents myStudents = new TheStudents(30000);
        int result3 = myStudents.getStud();
        institution = new TheInstitution();
        assertEquals("cnr Keizergracht & Tenant Str Cape Town 30000", result1 + " " + result2 + " " + result3);


    }
}