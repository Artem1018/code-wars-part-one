package com.marushchak;

import java.util.Arrays;
public class SortTheOdd {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{5, 8, 6, 3, 4})));
    }

    public static int[] sortArray(final int[] array) {

        final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();

        for (int j = 0, s = 0; j < array.length; j++) {
            if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
        }

        return array;
    }

}
