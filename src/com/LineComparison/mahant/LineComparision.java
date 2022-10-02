package com.LineComparison.mahant;
import java.util.*;

public class LineComparision {
	/*
	 * UC-4 Use Java Object Oriented Programming Concepts of Line and Point as well
	 * as equals and compareTo methods.
	 */
	static int result; //integer field exists on the class

	public double equalityOfLength1() {

		int x1 = 20, y1 = 70;
		int x2 = 9, y2 = 67;

		Double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		return length1;
	}
	public double equalityOfLength2() {
		
		int x3 = 2, y3 = 7;
		int x4 = 9, y4 = 7;
		
		Double length2 = Math.sqrt(Math.pow(x3 - x4, 2) + Math.pow(y3 - y4, 2));
		
		return length2;
	}

	public static void main(String[] args) {

		System.out.println("WELCOME TO LINE COMPARISON COMPUTATION PROGRAM....!!");

		LineComparision line = new LineComparision(); //creating object of line comparison
		
		Double lengthOfLine1 = line.equalityOfLength1(); // calling method 1 
		System.out.println("Length of first line : " + lengthOfLine1);
		
		Double lengthOfLine2 = line.equalityOfLength2(); // calling method 2
		System.out.println("Length of second line : " + lengthOfLine2);
		/*
		 * The wrapper class in Java provides the mechanism to convert primitive into
		 * object and object into primitive
		 * 
		 * Equality or compareTo doesn't work on primitive type
		 * 
		 * The equals() method compares two strings, and returns true if the strings are
		 * equal, and false if not
		 */
		System.out.println(lengthOfLine1.equals(lengthOfLine2)); //checkking eqaulity
		result = Double.compare(lengthOfLine1, lengthOfLine2); //comparing both lines
			if (result < 0) {
				System.out.println(lengthOfLine1 + " is lesser than" + lengthOfLine2);
			} else {
				System.out.println(lengthOfLine1 + "is greater than " + lengthOfLine2);
			}
		}
}