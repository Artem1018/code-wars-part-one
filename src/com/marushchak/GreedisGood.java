package com.marushchak;

import java.util.Arrays;

public class GreedisGood {

    public static void main(String[] args) {
        System.out.println(greedy(new int[]{2, 4, 4, 5, 4}));
    }

    public static int greedy(int[] dice){
        int triplet =findThreeNumber(dice);
        int score = 0;
        if (triplet == 0)
            score += findFiveOrOne(dice);
            else{
                if (triplet == 1)
                score += triplet * 1000;
                else
                    score += triplet * 100;
            dice = deleteThreeNumber(dice);
            score += findFiveOrOne(dice);
        }
        return score;
    }
    public static int findFiveOrOne(int[] arr){
            int score = 0;
        for (int j : arr) {
            if (j == 1) score += 100;
            if (j == 5) score += 50;
        }
        return score;
    }

    public static int findThreeNumber(int[] num){
        int counter = 0;
        int check = 0;
        while (check != 5){
            for (int i = 0; i < num.length; i++) {
                if (num[check] == num[i]);
                counter++;
            }
            check++;
        }
        for ()
        return 0;
    }

//    public static int findThreeNumber(int[] num){
//        int counter = 1;
//        for (int i = 1; i < num.length; i++) {
//            if (num[i-1] == num[i])
//                counter++;
//            else
//                counter = 1;
//
//            if (counter==3)
//                return num[i];
//        }
//        return 0;
//    }
    public static int[] deleteThreeNumber(int[] num){
        int counter = 1;
        int start = 0;
        int end = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i-1] == num[i])
                counter++;
            else{
                start = i;
                counter = 1;
            }


            if (counter==3){
                end = i+1;
                break;
            }
        }
        for (int i = start; i < end; i++) {
           num[i] = 0;
        }
       return num;
    }
}
