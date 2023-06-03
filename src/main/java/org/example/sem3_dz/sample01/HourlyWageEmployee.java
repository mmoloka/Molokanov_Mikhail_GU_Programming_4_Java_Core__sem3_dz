package org.example.sem3_dz.sample01;

public class HourlyWageEmployee extends BaseEmployee {

    private double hourlyRate;

    public HourlyWageEmployee(double hourlyRate, String firstName, String lastName, int id) {
        this.hourlyRate = hourlyRate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        salary = calculateSalary();
    }

    @Override
    protected double calculateSalary() {
        return 28 * 8 * hourlyRate;
    }

    @Override
    public String toString() {
        return "HourlyWageEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", salary=" + String.format("%.2f", salary) +
                '}';
    }
}
