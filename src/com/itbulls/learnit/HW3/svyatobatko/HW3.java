package com.itbulls.learnit.HW3.svyatobatko;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Random;

public class HW3 {
	
	
	
	
//	static Scanner sccc = new Scanner(System.in);
//	private static String[] array;
//	public static void getMaxValue() {
//		System.out.println("Enter integer numbers separated by space:");
//		String[] inputArr = sccc.nextLine().split(" ");

//	}
	public static void maxValue() {
		System.out.println("Sort masiv");
		int[] a = { 3,2,4,8,1,5};
		
		for (int num: a) {
			System.out.print(num + ",");
		}
		int count;
		do {
			count =0;
			for (int i = 0; i<a.length-1;i++) {
				if(a[i] > a[i+1] ) {
					int temp = a [i];
					a[i] = a [i+1];
					a [i+1]= temp;
					count++;
				}
			}
		
	} while (count > 0);
		System.out.println();
		
		for (int num : a) {
			System.out.print(num + ",");
		}
		System.out.println();
		System.out.println();
	}

	
	
	
	
	
	
	public static void getRectangle() {
//		int c;
		System.out.println("Your Rectangle");
		System.out.println("Enter height");
		Scanner scA = new Scanner(System.in);
		int a = scA.nextInt();

		System.out.println("Enter width");
		Scanner scB = new Scanner(System.in);
		int b = scB.nextInt();

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (i == 0 || i == a - 1)
					System.out.print("+");
				else {
					if (j == 0 || j == b - 1)
						System.out.print("+");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	
	
	public static void Words() {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter words in one line with a space");
        String input = sc.nextLine();
        int count = 0;
        if(input.length() != 0){
            count++;
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' '){
                    count++;
                }
            }
        }

        System.out.println("You entered "+count+" words");
    }
	
	
	public static void sumWords() {
		
	System.out.println("Enter any  words:");
	Scanner sc = new Scanner(System.in);
	String Word = sc.nextLine();
	String[] arr = Word.split(" ");
	String str = "";
	for (String val :  arr) {
		int i = 0;
		if (val.length() > 3)
			str = str + val + " ";
		i++;
	}
	arr = str.split(" ");
	System.out.println(str);
}
}
	
	
	
	
	
	
	
	
	
	
	

