package com.marushchak;

public class ASquareOfSquares {
    public static void main(String[] args) {
        System.out.println(isSquare(25));
    }
    public static boolean isSquare(int n) {
        double res = Math.sqrt(n);
        return res - (int) res == 0.0;
    }
}
