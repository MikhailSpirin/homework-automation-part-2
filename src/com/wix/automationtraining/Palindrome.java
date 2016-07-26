package com.wix.automationtraining;

public class Palindrome {

    public static void main(String[] args) {

        //to testPalindrome method, you can pass array of strings/digits or uses split("") methods..
        System.out.println(testPalindrome(new Integer[]{1, 2, 3, 3, 2, 1})); // positive integer
        System.out.println(testPalindrome(new Integer[]{1, 2, 3, 4, 3, 2, 1}));
        System.out.println(testPalindrome("1234554321".split("")));

        System.out.println(testPalindrome(new Integer[]{1, 2, 3, 4, 4, 5, 2, 1})); // negative integer
        System.out.println(testPalindrome(new Integer[]{1, 2, 3, 4, 5, 3, 2, 1}));
        System.out.println(testPalindrome(new Integer[]{1, 2, 3, 5, 6, 4, 3, 4}));
        System.out.println(testPalindrome("1234553434321".split("")));

        System.out.println(testPalindrome("abcba".split(""))); //positive! strings
        System.out.println(testPalindrome("abccba".split("")));
        System.out.println(testPalindrome("aibohphobia".split("")));

        System.out.println(testPalindrome("Aibohphobia".split(""))); // negative strings!
        System.out.println(testPalindrome("palindrome".split("")));
        System.out.println(testPalindrome("abcbasdfdf".split("")));
        System.out.println(testPalindrome("sdfg333gv".split("")));
    }

    public static boolean testPalindrome(Object source[]) {
        int len = source.length;
        for (int i = 0; i < len; i++) {
            // System.out.println(source[i] + " " + source[len-i-1]); //for testing purposes
            if (!source[i].equals(source[len-i-1])) return false;
            if (i>(len-i)) break;
        }
        return true;
    }
}
