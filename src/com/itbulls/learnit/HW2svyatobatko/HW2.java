package com.itbulls.learnit.HW2svyatobatko;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Random;

public class HW2 {

	public static void location() {
		int a;
		System.out.println("¬ведите число");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		String text = String.join("\n", String.valueOf(a).split(""));
		System.out.println(text);
	}

	public static void words() {

		System.out.println("Enter any 7 words:");
		Scanner sc = new Scanner(System.in);
		String inWords = sc.nextLine();
		String[] arr = inWords.split(" ");
		Arrays.sort(arr, (str1, str2) -> str2.length() - str1.length());
		System.out.println(Arrays.toString(arr));
	}

	public static void getPiramide() {
		System.out.println("¬ведите высоту пирамиды");
		int n = 7;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < n - (1 + i)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

	public static void numbersMus() {
		System.out.println("—осздаем массив");
		Random rand = new Random();
		int mas[] = new int[10];
		int mas2[] = new int[10];
		for (int i = 0; i < 10; i++) {
			mas[i] = rand.nextInt(20);
			System.out.print(mas[i] + " ");
		}
		for (int x = 0; x < mas.length; x++) {
			mas[x] = mas[x] * 2;
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}

	}
	
	

	
			
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


