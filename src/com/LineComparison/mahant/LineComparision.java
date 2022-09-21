package com.LineComparison.mahant;
import java.util.*;

public class LineComparision {

	public static void main(String[] args) {
		System.out.println("welcome to line comparison computation");
		/*
		 * UC1- taking input from user
		 */
	Scanner line = new Scanner(System.in);
	System.out.println("Enter the value for x1");
	int x1 = line.nextInt();
	System.out.println("Enter the value for x2");
	int x2 = line.nextInt();
	System.out.println("Enter the value for y1");
	int y1 = line.nextInt();
	System.out.println("Enter the value for y2");
	int y2 = line.nextInt();

	double lenghtOfLine = (Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)));
	System.out.println("The length of  Line i.e (x2-x1)+(y2-y1) = " + lenghtOfLine);
	line.close();

		}

	}