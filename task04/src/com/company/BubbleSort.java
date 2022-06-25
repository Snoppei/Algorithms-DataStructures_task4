package com.company;

import java.util.Comparator;

public class BubbleSort{

    public static <T extends Comparable<T>> void sort(T[] data, int from, int to) {

        class TempComparator implements Comparator<T> { // компаратор для сравнения не простых объектов
            @Override
            public int compare(T a, T b) {
                return a.compareTo(b);
            }
        }
        TempComparator c = new TempComparator();
        for (int i = from + 1; i < to - 1; i++) {
            for (int j = to - 1; j >= i; j--) {
                if (c.compare(data[j - 1], data[j]) > 0) {  // data[j - 1] > data[j]
                    T tmp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = tmp;
                }
            }
        }
    }

    public static void sort(int[] data, int from, int to) { // для простейших int
        for (int i = from + 1; i < to - 1; i++) {
            for (int j = to - 1; j >= i; j--) {
                if (data[j - 1] > data[j]) {
                    int tmp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = tmp;
                }
            }
        }
    }

}
