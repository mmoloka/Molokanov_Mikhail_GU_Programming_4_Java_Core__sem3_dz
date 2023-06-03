package org.example.sem3_dz.sample01;

public abstract class BaseEmployee implements SalaryComparable<BaseEmployee>, IdComparable<BaseEmployee> {

    protected String firstName;
    protected String lastName;
    protected int id;
    protected double salary;

    protected abstract double calculateSalary();

    @Override
    public int salaryCompareTo(BaseEmployee baseEmployee) {
        if (salary > baseEmployee.salary) return 1;
        else if (salary == baseEmployee.salary) return 0;
        else return -1;
    }

    @Override
    public int idCompareTo(BaseEmployee baseEmployee) {
        if (id > baseEmployee.id) return 1;
        else if (id == baseEmployee.id) return 0;
        else return -1;
    }
}
