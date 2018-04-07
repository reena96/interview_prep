package com.company.CTCI.ArraysAndStrings;

public class OneAway {
    public static void main(String[] args) {
        String one = "pale", two = "balk";
        if (one.length() >= two.length())
            System.out.println(checkOneAway(one, two));
        else
            System.out.println(checkOneAway(two, one));
    }

    private static boolean checkOneAway(String str1, String str2) {
        boolean set = false;
        int i = 0, j = 0;
        while (i < str1.length()) {
            if (str1.charAt(i) == (j == str2.length() ? ' ' : str2.charAt(j))) {
                i = i + 1;
                j = j + 1;
            } else {

                if (set) {
                    return false;
                }
                set = true;
                if (str1.length() == str2.length()) {
                    i = i + 1;
                    j = j + 1;
                } else i = i + 1;
            }

        }
        return true;

    }
}
