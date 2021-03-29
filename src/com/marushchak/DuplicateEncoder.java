package com.marushchak;
// The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if
// that character appears only once in the original string, or ")"
// if that character appears more than once in the original string
// Ignore capitalization when determining if a character is a duplicate.
//      Examples
//        "din"      =>  "((("
//        "recede"   =>  "()()()"
//        "Success"  =>  ")())())"
//        "(( @"     =>  "))(("
public class DuplicateEncoder {
    public static void main(String[] args) {
        System.out.println(encode("(( @"));
    }
    static String encode(String word){
        word = word.toLowerCase();
        char[] chArr = word.toCharArray();
        word = "";
        int counter = 0;
        for (char value : chArr) {
            for (char c : chArr) {
                if (value == c)
                    counter++;
            }
            if (counter > 1)
                word = word.concat(")");
            else word = word.concat("(");
            counter = 0;
        }
        return word;
    }
}
