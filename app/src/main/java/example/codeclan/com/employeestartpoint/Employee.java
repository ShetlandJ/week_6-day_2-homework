package example.codeclan.com.employeestartpoint;

/**
 * Created by user on 28/08/2017.
 */

public class Employee {
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public int getId() {
        return empId;
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        if(name != null) {
            this.name = name;
        }
        return this.name;
    }

    public String getSocialSecurityNumber() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

    public double increaseSalary(double amount) {
        if (amount > 0) {
            return this.salary += amount;
        }
        return this.salary;
    }
}
