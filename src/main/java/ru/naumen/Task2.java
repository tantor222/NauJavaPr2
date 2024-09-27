package ru.naumen;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    /**
     * Сортировка слиянием (Merge Sort).
     * @param array
     */
    public static void task2(ArrayList<Double> array) {
        if (array.size() < 2) {
            return;
        }

        int mid = array.size() / 2;

        ArrayList<Double> left = new ArrayList<>(array.subList(0, mid));
        ArrayList<Double> right = new ArrayList<>(array.subList(mid, array.size()));

        task2(left);
        task2(right);

        merge(array, left, right);
    }

    private static void merge(ArrayList<Double> array, ArrayList<Double> left, ArrayList<Double> right) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                array.set(k++, left.get(i++));
            } else {
                array.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            array.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            array.set(k++, right.get(j++));
        }
    }

    public static void main(String[] args) {
        var t = new ArrayList<>(List.of(1.2, 3.5, 3.3, 1.4, 1.5, 2.0));
        task2(t);
        System.out.println(t);
    }
}
