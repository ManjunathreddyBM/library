package com.manju.library.stringmanipulations;

import org.springframework.stereotype.Component;

@Component
public class StringManipulations {

    private String reverse(String stringToBeReversed) {
        return new StringBuilder(stringToBeReversed).reverse().toString();
    }
    private int wordCount(String string) {
        String[] str = string.split(" ");
        if (str.length == 0)
            return 0;
        else
            return str.length;
    }

    private int chartCount(String str) {
        char[] ch = new StringBuilder(str).toString().toCharArray();
        return ch.length;
    }
}
