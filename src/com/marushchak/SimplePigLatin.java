package com.marushchak;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
//Examples
//
//        pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
//        pigIt('Hello world !');     // elloHay orldway !
public class SimplePigLatin {
    public static void main(String[] args) {
        System.out.println(pigIt("Hello world !"));
        System.out.println(pigItAnotherSolution("Hello world !"));
    }
    public static String pigIt(String str) {
        StringBuilder sb = new StringBuilder();
        Pattern p = Pattern.compile("[a-zA-Z\\S]{1,}");
        Matcher m = p.matcher(str);
        while (m.find()){
            if (!m.group().equals("!") && !m.group().equals("?"))
            sb.append(m.group().substring(1)).append(m.group().charAt(0)).append("ay ");
            else sb.append(m.group().substring(1)).append(m.group().charAt(0)).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public static String pigItAnotherSolution(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}
