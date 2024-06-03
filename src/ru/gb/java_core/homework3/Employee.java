package ru.gb.java_core.homework3;

import java.time.LocalDate;
import java.util.Comparator;

public class Employee {
    private static int count;
    private final int id = ++count;
    private String name;
    private LocalDate hireDate;
    private double salary;

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getLocalDate() {
        return hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private Comparator<Employee> dateComparator(){
        return new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getLocalDate().compareTo(o2.getLocalDate());
            }
        };
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " +
                "id: " + id +
                ", name: '" + name + '\'' +
                ", hireDate: " + hireDate +
                ", salary: " + salary;
    }
}

