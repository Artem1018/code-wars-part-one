package com.marushchak;

public class StopGninnipSMySdroW {
    public static void main(String[] args) {
        System.out.println(spinWords("This is another test"));
    }

    public static String spinWords(String sentence) {
        char[] charStr = sentence.toCharArray();
        int letterCounter = 0;
        sentence = "";
        StringBuilder stringWord = new StringBuilder();
        for (int i = 0; i < charStr.length; i++) {

            if (charStr[i] == ' ' || i == charStr.length - 1){
                if (i == charStr.length - 1)
                    stringWord.append(charStr[i]);
                if (letterCounter >= 5){
                    stringWord.reverse();
                }
                sentence = sentence.concat(stringWord.toString() + " ");
                letterCounter = 0;
                stringWord = new StringBuilder();
                continue;
            }
            stringWord.append(charStr[i]);
            letterCounter++;
        }
        stringWord = new StringBuilder(sentence);
        stringWord.deleteCharAt(stringWord.length() - 1);
        return stringWord.toString();
    }
}
