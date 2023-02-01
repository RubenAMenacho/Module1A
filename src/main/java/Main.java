
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ramlifting
 */
import java.util.Scanner;
public class Main {
   public static void main(String[] args) 
	{
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		// initialize variables
		int num;	// user input
		
		System.out.print("Enter a number with five digits: ");
		num = input.nextInt();	// read five digits input
		
		if ( (num >= 10000) && (num <= 99999) )
		{
		System.out.printf("%d   ", (num / 10000));
		System.out.printf("%d   ", (num / 1000) % 10);
		System.out.printf("%d   ", (num / 100) % 10);
		System.out.printf("%d   ", (num % 100) / 10);
		System.out.printf("%d   ", (num % 10));
		}
		
		if (num > 99999)
			System.out.println("You had entered a number more than five digits.");
		
		if (num <= 9999)
			System.out.println("You had entered a number less than five digits.");
    }

}
