/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yesenia Cata 
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
{
    Scanner keyboardInput = new Scanner(System.in);

      System.out.print("Enter Noun: "); //Asks user to input noun 
      String noun = keyboardInput.nextLine();

      System.out.print("Enter a Verb : "); //asks user to input verb
      String Verb = keyboardInput.nextLine();

      System.out.print("Enter Adjective: "); //asks user to input adjective
      String Adjective = keyboardInput.nextLine();

      System.out.print("Enter Adverb: "); //asks user to input adverb
      String Adverb = keyboardInput.nextLine();

      System.out.println("Do you " + Verb+ " your " +Adjective +" "+ noun +" "+ Adverb+"? That's hilarious!"); // inputs all strings and makes statement 
   }
}

