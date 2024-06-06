package ru.gb.java_core.homework4;

// - В класс покупателя добавить перечисление с гендерами, добавить в сотрудника свойство «пол» со значением созданного перечисления. Добавить геттеры, сеттеры.
// - Добавить в основную программу перечисление с праздниками (нет праздника, Новый Год, 8 марта, 23 февраля), написать метод, принимающий массив сотрудников,
// поздравляющий всех сотрудников с Новым Годом, женщин с 8 марта, а мужчин с 23 февраля, если сегодня соответствующий день.

import ru.gb.java_core.homework4.enteties.Customer;
import ru.gb.java_core.homework4.enteties.Gender;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Customer[] customers = {new Customer("Jack", 20, "88005553535", Gender.MALE),
                new Customer("Maria", 25, "88005553535", Gender.FEMALE),
                new Customer("David", 30, "88005553535", Gender.MALE),
                new Customer("Liora", 30, "88005553535", Gender.FEMALE),
                new Customer("Tom", 28, "88005553535", Gender.MALE)};

        congratulateCustomers(customers);

    }

    public static void congratulateCustomers(Customer[] customers){
        LocalDate today = LocalDate.now();
        Month month = today.getMonth();
        int day = today.getDayOfMonth();
        for (Customer customer : customers){
            if (month == Month.JANUARY && day == 1){
                System.out.println("С нг, " + customer.getName());
            } else if (month == Month.MARCH && day == 8 && customer.getGender() == Gender.FEMALE) {
                System.out.println("c 8 марта, " + customer.getName());
            } else if (month == Month.FEBRUARY && day == 23 && customer.getGender() == Gender.MALE){
                System.out.println("c 23 февраля, " + customer.getName());
            }
        }
    }

}
