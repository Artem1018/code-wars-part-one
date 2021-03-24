package com.marushchak;

public class CreditCardMask {

    public static void main(String[] args) {
        // write your code here
        System.out.println(maskify("123455464356456345"));
    }

    public static String maskify(String str) {
        if(str.length() < 4)
            return str;
        String res = "";
        for (int i = 0; i < str.length() - 4; i++)
            res = res.concat("#");
        res = res.concat(getFourLastCharacters(str));
        return res;
    }

    public static String getFourLastCharacters(String str){
        char[] buffChar = str.toCharArray();
        str = "";
        for (int i = 0; i < 4; i++)
            str = str.concat(String.valueOf(buffChar[buffChar.length - (4 - i)]));
        return str;
    }
}
