import java.util.Scanner;

/*
Write a program that prompts the user to enter a point (x, y) 
and checks whether the point is within the rectangle centered 
at (0, 0) with width 10 and height 5.
Chintan Himanshu Jani 02/13/2019
*/

public class RectangleCHJ {
    public static void main (String[]args) {

        Scanner input = new Scanner(System.in);

    //ignore
        System.out.println("");

    //Ask for Coordinates (x,y)
        System.out.print("Enter a point with two coordinates (x,y): ");
        double x = input.nextDouble();
        double y = input.nextDouble();

    //String to replace else-if Statement
        String s = "";

    //Calculate Coordinates
        if (Math.abs(x) > 5 || Math.abs(y) > 2.5) {
         s = " not ";
            }

    //Read out the Results.        
        System.out.println("Point (" + x + ", " + y + ") is" + s
        + "in the rectangle.");

    //ignore
        System.out.println("");

    }
}