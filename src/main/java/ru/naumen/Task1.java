package ru.naumen;

import java.util.stream.IntStream;

public class Task1 {

    /**
     * Найти максимальное значение по модулю в массиве
     * @param arr
     */
    public static void task1(int[] arr) {
        System.out.println(IntStream.of(arr).map(Math::abs).max().orElse(0));
    }

    public static void main(String[] args) {
        task1(new int[] {1, 7, 5, 3, 4, 6, 9, -10, -4});
    }
}
