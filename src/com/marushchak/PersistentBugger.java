package com.marushchak;
// persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
// and 4 has only one digit
public class PersistentBugger {
    public static void main(String[] args) {
        System.out.println(persistence(4));
    }
    public static int persistence(int n) {
        byte res = 0;
        while (n > 9){
          n = getMultiplicationOfDigits(n);
          res++;
        }
        return res;
    }

    public static int getMultiplicationOfDigits(int n){
        char[] buffChar = String.valueOf(n).toCharArray();
        n = Integer.parseInt(String.valueOf(buffChar[0]));
        for (int i = 1; i < buffChar.length; i++) {
            n *= Integer.parseInt(String.valueOf(buffChar[i]));
        }
        return n;
    }

}
