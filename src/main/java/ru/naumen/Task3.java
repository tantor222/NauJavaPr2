package ru.naumen;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    /**
     * Необходимо реализовать java-класс сотрудник (код “Employee”).
     * Приватные поля класса: ФИО (“fullName” тип “String”), Возраст (“age”
     * тип “Integer”), Отдел (“department” тип “String”), З/П (“salary” тип
     * “Double”). Класс должен содержать геттеры и сеттеры для доступа к
     * полям.
     * @param employees
     * @return
     */
    public static void task3(List<Employee> employees) {
        List<Employee> filteredEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() > 30) {
                filteredEmployees.add(employee);
            }
        }
        System.out.println("Сотрудники старше 30 лет:");
        for (Employee employee : filteredEmployees) {
            System.out.println(employee.getFullName() + ", возраст: " + employee.getAge());
        }
    }

    public static void main(String[] args) {
        task3(List.of(
                new Employee("Иван Иванов", 28, "Отдел разработки", 50000.0),
                new Employee("Петр Петров", 35, "Отдел маркетинга", 60000.0),
                new Employee("Мария Сидорова", 40, "Отдел продаж", 70000.0),
                new Employee("Анна Кузнецова", 25, "Отдел кадров", 45000.0)
        ));
    }
}
