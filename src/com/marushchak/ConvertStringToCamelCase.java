package com.marushchak;
//        Complete the method/function so that it converts dash/underscore delimited words into camel casing.
//        The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).
//        Examples
//        "the-stealth-warrior" gets converted to "theStealthWarrior"
//        "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertStringToCamelCase {
    public static void main(String[] args) {
        System.out.println(toCamelCase(""));
    }

    public static String toCamelCase(String s){
        if (s.equals(""))
            return "";
        StringBuilder sb = new StringBuilder(s);
        String[] strArr = s.split("-");
        if (strArr.length == 1)
            strArr = s.split("_");

        for (int i = 0; i < strArr.length; i++) {
                if (i == 0){
                     if (strArr[0].charAt(0) >= 'A' && strArr[0].charAt(0) <= 'Z'){
                    strArr[i] = strArr[i].substring(0, 1).toUpperCase() + strArr[i].substring(1);
                     }
                    continue;
                }
            strArr[i] = strArr[i].substring(0, 1).toUpperCase() + strArr[i].substring(1);
        }
        s = "";
        for (String value : strArr) {
            s = s.concat(value);
        }
        return s;
    }

//    public static String toCamelCase(String s){
//        Pattern p =
//        return "";
//    }



}
