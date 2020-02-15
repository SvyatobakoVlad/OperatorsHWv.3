package com.itbulls.learnit.HW2svyatobatko;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Random;

public class HW2 {

	public static void location() {
		int a;
		System.out.println("Insert the number");
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
		System.out.println("Enter the height of the pyramid");
		int n;
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
		System.out.println("Create an array");
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
		System.out.println();
	}

	public static void myMatrix() {
		double[][] Matrix = { { 1.1, 1.2, 1.3, 1.4, 1.5 }, { 2.1, 2.2, 2.3, 2.4, 2.5 }, { 3.1, 3.2, 3.3, 3.4, 3.5 },
				{ 4.1, 4.2, 4.3, 4.4, 4.5 }, { 5.1, 5.2, 5.3, 5.4, 5.5 }, };
		double[][] orig_matrix = new double[5][5];

		for (int i = 1; i <= 5; i++) {
			double b = 0.1;
			for (int j = 0; j < 5; j++) {
				orig_matrix[i - 1][j] = i + b;
				b += 0.1;
			}
		}

		System.out.println("Your matrix: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(orig_matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}
}
