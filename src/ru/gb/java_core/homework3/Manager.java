package ru.gb.java_core.homework3;

import java.time.LocalDate;
import java.util.List;

public class Manager extends Employee {
    public Manager(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public static void raiseSalary(List<Employee> employeeList, double increase){
        for (Employee employee : employeeList){
            if (!(employee instanceof Manager)){
                employee.setSalary(employee.getSalary() + increase);
            }
        }
    }
}
