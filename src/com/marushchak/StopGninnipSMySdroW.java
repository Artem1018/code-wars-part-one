package com.marushchak;
//Description:
//
//        Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.
//
//        Examples:
//        spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
//        spinWords( "This is a test") => returns "This is a test"
//        spinWords( "This is another test" )=> returns "This is rehtona test"
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
