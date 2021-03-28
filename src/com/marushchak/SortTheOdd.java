package com.marushchak;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class SortTheOdd {
    public static void main(String[] args) {
        //System.out.println(selectionSort(new int[]{5, 8, 6, 3, 4}));
        //System.out.println(Arrays.toString(sortFiltered(new int[]{5, 8, 6, 3, 4}, (n) -> n % 2 != 0)));
        System.out.println(Arrays.toString(sortArray(new int[]{5, 8, 6, 3, 4})));
    }

    public static int[] sortArray(int[] array) {
        IntPredicate predicate = (n) -> n % 2 != 0;
        int[] filtered = IntStream.of(array).filter(predicate).sorted().toArray();
        int[] dst = new int[array.length];
        for (int i = 0, j = 0; i < array.length; i++) {
            dst[i] = predicate.test(array[i]) ? filtered[j++] : array[i];
        }
        return dst;
    }

    public static int[] sortFiltered(int[] src, IntPredicate predicate) {
        int[] filtered = IntStream.of(src).filter(predicate).sorted().toArray();
        int[] dst = new int[src.length];
        for (int i = 0, j = 0; i < src.length; i++) {
            dst[i] = predicate.test(src[i]) ? filtered[j++] : src[i];
        }
        return dst;
    }
}
