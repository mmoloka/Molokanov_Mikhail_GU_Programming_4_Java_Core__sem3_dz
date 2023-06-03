package org.example.sem3_dz.sample01;

public class FixedWageEmployee extends BaseEmployee {

    private double fixedRate;

    public FixedWageEmployee(double fixedRate, String firstName, String lastName, int id) {
        this.fixedRate = fixedRate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        salary = calculateSalary();
    }

    @Override
    protected double calculateSalary() {
        return fixedRate;
    }

    @Override
    public String toString() {
        return "FixedWageEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", salary=" + String.format("%.2f", salary) +
                '}';
    }
}
