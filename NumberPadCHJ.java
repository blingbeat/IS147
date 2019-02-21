/*
Write a program that prompts the user to enter a letter and displays its corresponding
number.
Chintan Himanshu Jani 02/21/2019
*/

import java.util.Scanner;

public class NumberPadCHJ {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //ignore
        System.out.println("");

        //Ask user for a letter
        System.out.print("Enter a letter: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        ch = Character.toUpperCase(ch);

        //Display Digits
        int number = 0;
        if (Character.isLetter(ch))
        {
            if (ch <= 'C')
                number = 2;
            else if (ch <= 'F')
                number = 3;
            else if (ch <= 'I')
                number = 4;
            else if (ch <= 'L')
                number = 5;
            else if (ch <= 'O')
                number = 6;
            else if (ch <= 'S')
                number = 7;
            else if (ch <= 'V')
                number = 8;
            else if (ch <= 'Z')
                number = 9;
            
            System.out.println("Your corresponding number is " + number);

        //ignore
        System.out.println("");

        }
    }
}