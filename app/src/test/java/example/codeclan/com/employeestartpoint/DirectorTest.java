package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by James on 24/10/2017.
 */

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director(5, "Captain 'the crook' Hook", "50007", 50000.0, "IT", 100000.0);
    }

    @Test
    public void directorHasId() {
        assertEquals(5, director.getId());
    }

    @Test
    public void directorHasName() {
        assertEquals("Captain 'the crook' Hook", director.getName());
    }

    @Test
    public void directorHasSsn() {
        assertEquals("50007", director.getSocialSecurityNumber());
    }

    @Test
    public void directorHasSalary() {
        assertEquals(50000.0, director.getSalary(), 0.01);
    }

    @Test
    public void directorHasDeptName() {
        assertEquals("IT", director.getDept());
    }


    @Test
    public void directorSalaryCanBeIncreased() {
        director.increaseSalary(20000.0);
        assertEquals(70000.0, director.getSalary());
    }
}