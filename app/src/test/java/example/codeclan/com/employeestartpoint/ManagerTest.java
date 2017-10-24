package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

/**
 * Created by James on 24/10/2017.
 */

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager(2, "James", "50001", 30000.0, "Management");
    }

    @Test
    public void managerHasId() {
        assertEquals(2, manager.getId());
    }

    @Test
    public void managerHasName() {
        assertEquals("James", manager.getName());
    }

    @Test
    public void managerHasSsn() {
        assertEquals("50001", manager.getSocialSecurityNumber());
    }

    @Test
    public void managerHasSalary() {
        assertEquals(30000.0, manager.getSalary(), 0.01);
    }

    @Test
    public void managerHasDeptName() {
        assertEquals("Management", manager.getDept());
    }


    @Test
    public void managerSalaryCanBeIncreased(){
        manager.increaseSalary(5000.0);
        assertEquals(35000.0, manager.getSalary());
    }
}
