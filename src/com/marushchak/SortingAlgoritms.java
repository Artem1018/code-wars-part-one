package com.marushchak;

public class SortingAlgoritms {
    public static void main(String[] args) {
        int[]arr=new int[]{1,3,2,6,4,7,5,8};
        print(arr);
        System.out.println("");
        print(bubbleSort(arr));
    }

    public static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j]>arr[j+1]) {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
    }
        return arr;
    }

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
