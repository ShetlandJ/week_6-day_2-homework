package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by James on 24/10/2017.
 */

public class AdminTest {
    Admin admin;

    @Before
    public void before() {
        admin = new Admin(3, "Chareth Cutestory", "50003", 15000.0);
    }

    @Test
    public void adminHasId() {
        assertEquals(3, admin.getId());
    }

    @Test
    public void adminHasName() {
        assertEquals("Chareth Cutestory", admin.getName());
    }

    @Test
    public void adminHasSsn() {
        assertEquals("50003", admin.getSocialSecurityNumber());
    }

    @Test
    public void adminHasSalary() {
        assertEquals(15000.0, admin.getSalary(), 0.01);
    }


    @Test
    public void adminSalaryCanBeIncreased() {
        admin.increaseSalary(1000.0);
        assertEquals(16000.0, admin.getSalary(), 0.01);
    }
}
