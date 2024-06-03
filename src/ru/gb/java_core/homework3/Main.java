package ru.gb.java_core.homework3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", LocalDate.of(2020, 1, 15));
        Employee emp2 = new Employee("Bob", LocalDate.of(2019, 2, 20));
        Employee emp3 = new Employee("Charlie", LocalDate.of(2018, 3, 25));
        Employee emp4 = new Employee("David", LocalDate.of(2020, 4, 30));
        Employee emp5 = new Employee("Frank", LocalDate.of(2020, 6, 15));

        emp1.setSalary(5000);
        emp2.setSalary(5200);
        emp3.setSalary(4800);
        emp4.setSalary(3500);
        emp5.setSalary(4000);

        Manager mgr1 = new Manager("Alice", LocalDate.of(2020, 1, 15));
        Manager mgr2 = new Manager("Bob", LocalDate.of(2019, 2, 20));
        Manager mgr3 = new Manager("Charlie", LocalDate.of(2018, 3, 25));
        Manager mgr4 = new Manager("David", LocalDate.of(2020, 4, 30));
        Manager mgr5 = new Manager("Frank", LocalDate.of(2020, 6, 15));

        mgr1.setSalary(5000);
        mgr2.setSalary(5200);
        mgr3.setSalary(4800);
        mgr4.setSalary(3500);
        mgr5.setSalary(4000);

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(mgr1);
        employees.add(mgr2);
        employees.add(mgr3);
        employees.add(mgr4);
        employees.add(mgr5);

        System.out.println("Before raise: ");
        for (Employee employee : employees){
            System.out.println(employee);
        }

        Manager.raiseSalary(employees, 300);

        System.out.println("\nAfter raise: ");
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
}
