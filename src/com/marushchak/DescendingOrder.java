package com.marushchak;

//Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order.
//Essentially, rearrange the digits to create the highest possible number.
//
//        Examples:
//        Input: 42145 Output: 54421
//        Input: 145263 Output: 654321
//        Input: 123456789 Output: 987654321

public class DescendingOrder {

    public static void main(String[] args) {
        System.out.println(sortDesc(42145));
    }

    public static int sortDesc(final int num) {
        String strNumber = String.valueOf(num);
        int[] arr = new int[strNumber.length()];
        char[] cArr = strNumber.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(cArr[i]));
        }
        return selectionSort(arr);
    }

    public static int selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] > arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        String str = "";
        for (int j : arr) {
            str = str.concat(String.valueOf(j));
        }
        return Integer.parseInt(str);
    }

}
