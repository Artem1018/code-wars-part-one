package com.marushchak;

import com.sun.codemodel.internal.JCase;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        while (true) {

            //System.out.println(sumTwoNumbers(5,6));
            System.out.print("Please, input first digit -> ");
            int a = scanner.nextInt();
            System.out.print("Please, input second digit -> ");
            int b = scanner.nextInt();
            System.out.println("choose an operation: ");
            System.out.println("1 -> sum");
            System.out.println("2 -> substract");
            System.out.println("3 -> multipli");
            System.out.println("4 -> division");
            int userChoice = scanner.nextInt();
            System.out.println("*****");
            System.out.println(calculiator(a,b,userChoice)+"\n+\n");
        }

    }

    public static int sumTwoNumbers(int a, int b){
        return a + b;

    }
public static double calculiator(int a, int b, int key){
    switch (key){
        case 1:
            return (int) a + b;
        case 2:
            return a - b;
        case 3:
            return a * b;
        default:
            return (double)a / b;
    }





}
}
