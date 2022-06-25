package com.company;

public class Main {

    public static void main(String[] args) {
        Integer[] array = {8, 4, 2, 1, 9, 29, 19, 15, 3, 4, 5, 6};

	    BubbleSort.sort(array, 4, 11);
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        // from – индекс первого элемента диапазона,
        // to – индекс элемента, следующего за последним элементом диапазона.
    }
}
