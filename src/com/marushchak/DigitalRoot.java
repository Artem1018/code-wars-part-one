package com.marushchak;

public class DigitalRoot {
    public static void main(String[] args) {
        System.out.println(digital_root(158));
        System.out.println(digital_root_second_way(158));
    }
    public static int digital_root(int n) {
        while (String.valueOf(n).length() != 1)
            n = getSumOfDigits(n);
        return n;
    }
    public static int getSumOfDigits(int n){
        char[] buffChar = String.valueOf(n).toCharArray();
        n = 0;
        for (char c : buffChar)
            n += Integer.parseInt(String.valueOf(c));
        return n;
    }
    public static int digital_root_second_way(int n) {
        while (n > 9)
            n = n/10 + n % 10;
        return  n;
    }
}
