/*
 * created:		10/30/2020
 * modified:	12/27/2024 - added comments and format
 * description:	finds your BMI based on height in inches and weight in pounds
 * 				also gives additional information if under/over weight
 */
package archiveRepls;

import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double in, lb, kg, m, bmi, low, high, sho;

		// inputs
		System.out.print("your height in inches: "); 
		in = input.nextFloat();

		System.out.print("your weights: ");
		lb = input.nextFloat();

		// convert to metric
		kg = lb / 2.20462;
		m = in / 39.3701;

		// find and print BMI
		bmi = Math.round(kg / (m*m));
		System.out.print("\nYour BMI is " + bmi + ", which is "); // report bmi

		// report bmi category
		if (bmi < 18.5)
			System.out.print("underweight");
		else if (bmi <= 24.9)
			System.out.print("normal weight");
		else if (bmi <= 29.9)
			System.out.print("overweight");
		else if (bmi <= 34.4)
			System.out.print("obese");
		else if (bmi <= 39.9)
			System.out.print("severely obese(I)");
		else if (bmi <= 49)
			System.out.print("morbidly obese(II)");
		else if (bmi >= 50)
			System.out.print("super obese(III)");

		// additional information about weight adjustments
		if(bmi > 18.5 && bmi <= 24.9){ 	// normal weight does not get additional info
			return;
		} else{
			high = (m*m) * 24.9 * 2.205; 	// find high and low weight of "normal" BMI
			low = (m*m) * 18.6 * 2.205;		// could be done with a static number

			if(bmi<18.5){			// light
				sho = low - lb;
				System.out.print(". You are " + Math.round(sho) + "lbs too light.");
			}else if(bmi >= 24.9){	// heavy
				sho = lb - high;
				System.out.print(". You are " + Math.round(sho) + "lbs too heavy.");
			} else{					// null case
				return;
			}	

			System.out.print(" You should be " + Math.round(low) + "lbs to "+ Math.round(high) + "lbs to have a normal weight.");
		}
		System.out.println(" Don't forget that the calculator doesnt include muscle index."); // disclaimer
	}
}
