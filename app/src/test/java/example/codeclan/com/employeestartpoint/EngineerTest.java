package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by James on 24/10/2017.
 */

public class EngineerTest {
    Engineer engineer;

    @Before
    public void before() {
        engineer = new Engineer(4, "Barry Zuckercorn", "50004", 25000.0);
    }

    @Test
    public void engineerHasId() {
        assertEquals(4, engineer.getId());
    }

    @Test
    public void engineerHasName() {
        assertEquals("Barry Zuckercorn", engineer.getName());
    }

    @Test
    public void engineerHasSsn() {
        assertEquals("50004", engineer.getSocialSecurityNumber());
    }

    @Test
    public void engineerHasSalary() {
        assertEquals(25000.0, engineer.getSalary(), 0.01);
    }


    @Test
    public void engineerSalaryCanBeIncreased() {
        engineer.increaseSalary(2500.0);
        assertEquals(27500.0, engineer.getSalary(), 0.01);
    }
}

