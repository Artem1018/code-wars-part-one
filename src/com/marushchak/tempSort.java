package com.marushchak;

public class tempSort {
    static class SelectionSort {
        void sort(int arr[]){
            int n = arr.length;
            for (int i = 0; i < n-1; i++) {

                int min_idx = i;
                for (int j = i+1; j < n; j++)
                    if (arr[j] < arr[min_idx])
                        min_idx = j;
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
        void printArray(int arr[]){
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i]+" ");
            System.out.println();
        }
    }
    static class BubbleSort{
        void bubbleSort(int arr[]){
            int n = arr.length;
            for (int i = 0; i < n-1; i++)
                    for (int j = 0; j < n-i-1; j++)
                    if (arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
        }
        void printArray(int arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();

    }

}
