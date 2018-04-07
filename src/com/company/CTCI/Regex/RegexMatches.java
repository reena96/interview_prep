package com.company.CTCI.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

    public static void main( String args[] ) {
        // String to be scanned to find the pattern.
        String line = "This order was placed for QT3000! OK?";
        String regex = "(.*)(\\d+)(.*)";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Now create matcher object.
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            System.out.println("Found value: " + matcher.group(0) );
            System.out.println("Found value: " + matcher.group(1) );
            System.out.println("Found value: " + matcher.group(2) );
        }else {
            System.out.println("NO MATCH");
        }

        // Making an instance of Pattern class
        // By default quantifier "+" is Greedy
        Pattern p = Pattern.compile("g+");

        // Making an instance of Matcher class
        Matcher m = p.matcher("ggg");

        /***

        m.start() - returns the index of the first character matched
        m.end() - returns the offset after the last character matched

        ***/
        while (m.find())
            System.out.println("Pattern found from " + m.start() + " " + m.start() +
                    " to " + (m.end()-1));
    }
}