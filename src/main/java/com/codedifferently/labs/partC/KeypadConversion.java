package com.codedifferently.labs.partC;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class KeypadConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println(" ");
        String messge = scanner.nextLine().toLowerCase();

        char ch1 = messge.length() > 0 ? messge.charAt(0) : ' ';
        char ch2 = messge.length() > 1 ? messge.charAt(1) : ' ';
        char ch3 = messge.length() > 2 ? messge.charAt(2) : ' ';

        String result = convertToKeypad(ch1) + convertToKeypad(ch2) + convertToKeypad(ch3);
        System.out.println("keyboard:" + result);
    }

    public static String convertToKeypad(char ch) {
        switch (ch) {
            case 'a': return "2";
            case 'b': return "22";
            case 'c': return "222";
            case 'd': return "3";
            case 'e': return "33";
            case 'f': return "333";
            case 'g': return "4";
            case 'h': return "44";
            case 'i': return "444";
            case 'j': return "5";
            case 'k': return "55";
            case 'l': return "555";
            case 'm': return "6";
            case 'n': return "66";
            case 'o': return "666";
            case 'p': return "7";
            case 'q': return "77";
            case 'r': return "777";
            case 's': return "7777";
            case 't': return "8";
            case 'u': return "88";
            case 'v': return "888";
            case 'w': return "9";
            case 'x': return "99";
            case 'y': return "999";
            case 'z': return "9999";
            case ' ': return "0"; 
            default: return "";
            }
        }

    }



