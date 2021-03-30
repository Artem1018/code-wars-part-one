package com.marushchak;
//The number 89 is the first integer with more than one digit that fulfills the property partially introduced in the title of this kata. What's the use of saying "Eureka"? Because this sum gives the same number.
//
//        In effect: 89 = 8^1 + 9^2
//
//        The next number in having this property is 135.
//
//        See this property again: 135 = 1^1 + 3^2 + 5^3
//
//        We need a function to collect these numbers, that may receive two integers a, b that defines the range [a, b] (inclusive) and outputs a list of the sorted numbers in the range that fulfills the property described above.
//        Let's see some cases:
//
//        sum_dig_pow(1, 10) == [1, 2, 3, 4, 5, 6, 7, 8, 9]
//
//        sum_dig_pow(1, 100) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 89]

import java.util.ArrayList;
import java.util.List;

public class TwoNumAndSumItsDigitsRasedToTheConsecutive {
    public static void main(String[] args) {
        System.out.println(sumDigPow(1, 200));
    }

//    89 = 8^1 + 9^2 = 89
//    135 = 1^1 + 3^2 + 5^3 = 135
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> arrList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int buffNumber = 0;
        int buff;
        int pow;
        for (int i = (int)a ; i < b; i++) {
            pow = 1;
            sb.append(i);
            sb.reverse();
            buff = Integer.parseInt(sb.toString());
            while(buff>0){
                if(buff<10) {
                    buffNumber += Math.pow(buff, pow);
                    break;
                }
                buffNumber += Math.pow(buff%10, pow);
                buff= buff/10;
                pow++;
            }
            if (i == buffNumber)
                arrList.add((long) buffNumber);
            buffNumber = 0;
            sb = new StringBuilder();
        }
        return arrList;
    }

}
