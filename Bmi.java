package Yazdan;
import java.util.*;

public class Bmi {

	public static double BMI(double h, double w) {
		double bmi = w/(h*h);
		return bmi;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		//Taking input of weight
		System.out.println("Enter weight in KG:");
		double weight = sc.nextDouble();
		
		//Taking input of height
		System.out.println("Enter height in Metres:");
		double height = sc.nextDouble();
		
		//calling BMI Function and printing BMI;
		double res = BMI(height, weight);
		System.out.println("Your BMI is: "+res);
		
		//Printing status according to bmi
		if(res<=18.4) {
			System.out.println("You are Underwight");
		}
		else if(res>=18.5 && res<=24.9) {
			System.out.println("You are Normal");
		}
		else if(res>=25 && res<=39.9) {
			System.out.println("You are Overweight");
		}
		else {
			System.out.println("You are Obese");
		}
		
	}

}
