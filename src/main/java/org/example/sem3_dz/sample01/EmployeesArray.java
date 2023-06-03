package org.example.sem3_dz.sample01;

public class EmployeesArray {

    public static BaseEmployee[] employees;

    public static void printArrayItems() {
        for (BaseEmployee employee : employees)
            System.out.println(employee);
    }
}
