package com.marushchak;
//Given two integers a and b, which can be positive or negative, find the sum of all the integers between including them too and return it. If the two numbers are equal return a or b.
//
//        Note: a and b are not ordered!
//
//Examples
//
//        GetSum(1, 0) == 1   // 1 + 0 = 1
//        GetSum(1, 2) == 3   // 1 + 2 = 3
//        GetSum(0, 1) == 1   // 0 + 1 = 1
//        GetSum(1, 1) == 1   // 1 Since both are same
//        GetSum(-1, 0) == -1 // -1 + 0 = -1
//        GetSum(-1, 2) == 2  // -1 + 0 + 1 + 2 = 2

public class BeginnerSeriesSumOfNumbers {
    public static void main(String[] args) {
        System.out.println(GetSum(1, 2));
    }

    public static int GetSum(int a, int b) {
        int sum = 0;
        if (a == b)
            return a;
        int min, max;
        if (a<b) {
            min = a;
            max = b;
        }
        else{
            min = b; max = a;
        }

        for (int i = min; i < max + 1; i++)
            sum += i;
        return sum;
    }

}
