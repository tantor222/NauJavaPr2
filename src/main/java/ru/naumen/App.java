package ru.naumen;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World!");
        Task1.task1(new int[] {1, 7, 5, 3, 4, 6, 9, -10, -4});
        var t = new ArrayList<>(List.of(1.2, 3.5, 3.3, 1.4, 1.5, 2.0));
        Task2.task2(t);
        System.out.println(t);
        Task3.task3(List.of(
                new Employee("Иван Иванов", 28, "Отдел разработки", 50000.0),
                new Employee("Петр Петров", 35, "Отдел маркетинга", 60000.0),
                new Employee("Мария Сидорова", 40, "Отдел продаж", 70000.0),
                new Employee("Анна Кузнецова", 25, "Отдел кадров", 45000.0)
        ));
        Task4.task4();
        Task5.task5();

    }
}
