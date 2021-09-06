package assignment.exercise;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Deaja Murphy
 */


/*
 * Create String to store input
 * Create int to count strings
 * Print Statement asking for string
 * Take user input into String
 * loop through string to count characters
 * Print final output with the number of characters
 */

import java.util.Scanner;
public class Solution03 {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("What is the quote? ");
        String quote = userIn.nextLine();
        System.out.println("Who said it? ");
        String author = userIn.nextLine();
        System.out.println(author +" says, "  +"\"" +quote +"\"");
    }
}
