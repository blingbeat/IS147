import java.util.Scanner;

public class MaxValueCHJ
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    int max = 0; //set largest value
    int count = 0; //set to count the occurences
    int number; //int set for future inputs 

    System.out.println("");
    
    //Ask for input
    System.out.print("enter a few numbers (separated by spaces): ");
    do {
        number = input.nextInt();
        if (number > max) {
            count = 0;
            max = number;
        }
        if (number == max) {
            count++;
        }

    } while (number != 0);

    System.out.println("The largest number is " + max + ".");
    System.out.println("The occurrence count is: " + count + ".");

    }
}
