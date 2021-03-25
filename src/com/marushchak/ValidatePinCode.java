package com.marushchak;

public class ValidatePinCode {
    public static void main(String[] args) {
        System.out.println(validatePin("123021"));
    }
    public static boolean validatePin(String pin) {
        // Your code here...
        if (pin.length() == 4 || pin.length() == 6)
            return pin.chars().allMatch(Character::isDigit);
        return false;
    }
}