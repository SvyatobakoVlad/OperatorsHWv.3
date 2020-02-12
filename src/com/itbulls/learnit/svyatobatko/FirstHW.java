package com.itbulls.learnit.svyatobatko;

import java.util.Scanner;

public class FirstHW {

	// Proverka

	public static void one_Sum() {

		String num1 = "15";
		String num2 = "5";
		int num5;

		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		num5 = num4 + num3;
		System.out.println("the sum of two numbers = " + num5);

	}

	public static void two_Area() {

		double a;
		double b;
		double c;
		double p;
		double Area;
		double result;

		System.out.println("The program calculates the area of a triangle");
		System.out.println("Enter the first number");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("Enter the second number");
		b = sc.nextInt();
		System.out.println("Enter the third number");
		c = sc.nextInt();

		p = (a + b + c) / 2;
		Area = p * (p - a) * (p - b) * (p - c);
		result = Math.sqrt(Area);
		System.out.println("Area of a triangle = " + result);

	}

	public static void three_radius() {

		double d;
		double resultTwo;

		System.out.println("The program calculates the circle circumference");
		System.out.println("Enter circle radius");
		Scanner sc = new Scanner(System.in);
		d = sc.nextInt();

		resultTwo = Math.PI * d;
		System.out.println("Circle circumference = " + resultTwo);

	}
}
