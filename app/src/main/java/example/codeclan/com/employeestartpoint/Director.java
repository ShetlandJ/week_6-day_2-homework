package example.codeclan.com.employeestartpoint;

/**
 * Created by James on 24/10/2017.
 */

public class Director extends Manager {
    private double budget;


    public Director(int empId, String name, String ssn, double salary, String deptName, double budget) {
        super(empId, name, ssn, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }
}
