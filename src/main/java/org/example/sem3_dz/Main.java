package org.example.sem3_dz;

import org.example.sem3_dz.sample01.BaseEmployee;
import org.example.sem3_dz.sample01.EmployeesArray;
import org.example.sem3_dz.sample01.FixedWageEmployee;
import org.example.sem3_dz.sample01.HourlyWageEmployee;

public class Main {
    public static void main(String[] args) {
        BaseEmployee[] employees = {
                new HourlyWageEmployee(510.5, "Ivanov", "Ivan", 1),
                new FixedWageEmployee(80000.0, "Ivanova", "Anna", 2),
                new HourlyWageEmployee(645.9, "Petrov", "Petr", 3),
                new FixedWageEmployee(90000.0, "Petrova", "Olga", 4),
                new HourlyWageEmployee(580.7, "Sidorov", "Sidor", 5),
                new FixedWageEmployee(85000.0, "Sidorova", "Vera", 6)
        };

        EmployeesArray.employees = employees;

        EmployeesArray.printArrayItems();
        System.out.println();
        // сортируем пузырьком массив сотрудников по убыванию id
        for (int j = 0; j < employees.length; j++) {
            for (int i = 0; i < employees.length - 1 - j; i++) {
                if (employees[i].idCompareTo(employees[i + 1]) < 0) {
                    BaseEmployee tmp = employees[i];
                    employees[i] = employees[i + 1];
                    employees[i + 1] = tmp;

                }
            }
        }

        EmployeesArray.printArrayItems();
        System.out.println();
        // сортируем пузырьком массив сотрудников по возрастанию заработной платы
        for (int j = 0; j < employees.length; j++) {
            for (int i = 0; i < employees.length - 1 - j; i++) {
                if (employees[i].salaryCompareTo(employees[i + 1]) > 0) {
                    BaseEmployee tmp = employees[i];
                    employees[i] = employees[i + 1];
                    employees[i + 1] = tmp;

                }
            }
        }

        EmployeesArray.printArrayItems();
    }
}
