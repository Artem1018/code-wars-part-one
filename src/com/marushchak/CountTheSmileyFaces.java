package com.marushchak;

import java.util.ArrayList;
import java.util.List;

public class CountTheSmileyFaces {
    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");
        System.out.println(countSmileys(a));
        System.out.println("Second -> " + countSmileysSecondSolution(a));
    }
    public static int countSmileys(List<String> arr) {
        int result = 0;
        for (String s : arr) {
            if (s.length() == 2) {
                if (s.charAt(0) == ':'
                        || s.charAt(0) == ';') {
                    if (s.charAt(s.length() - 1) == ')'
                            || s.charAt(s.length() - 1) == 'D')
                        result++;
                }
            } else if (s.length() == 3){
                if (s.charAt(0) == ':'
                        || s.charAt(0) == ';') {
                    if (s.charAt(s.length() - 2) == '-'
                            || s.charAt(s.length() - 2) == '~') {
                        if (s.charAt(s.length() - 1) == ')'
                                || s.charAt(s.length() - 1) == 'D')
                            result++;
                    }
                }
            }
        }
        return result;
    }

    public static int countSmileysSecondSolution(List<String> arr) {
            return (int)arr.stream().filter( x -> x.matches("[:;][-~]?[)D]")).count();
        }
}
