package com.itbulls.learnit.HW2svyatobatko;
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Random;

public class HW2 {
	
	
	
	
	public static void location() {
	int a;
	Scanner sc = new Scanner (System.in);
	a = sc.nextInt();
	String text = String.join("\n", String.valueOf(a).split(""));
		System.out.println(text); 
		}
	
	
	
	
	public static void words() {
		String[] array = {"asd", "asdf", "a", "Z", "zasd"};
		Arrays.sort(array, Comparator.reverseOrder());
		Arrays.sort(array, 
				(str1, str2) -> str1.compareToIgnoreCase(str2));
		System.out.println(Arrays.toString(array));
	
	
	
//		Arrays.sort(strings, Comparator.reverseOrder());
//		assertArrayEquals(new String[]{ "with", "learning", "java", "baeldung" }, strings);
//	System.out.println(Arrays.toString(array));

	}
	
	
	
	




    public static void getPiramide() {
       
    	int n = 7;
    	
    	for (int i = 0; i < n; i++) {
    		for (int j = 0; j < n; j++) {
    			if (j < n-(1+i)) {
    				System.out.print(" ");
    			}
    			else {
    				System.out.print("*");
    			}
    	}
    		System.out.println();
    	}
    	
}

	
    
    
    public static void numbersMus() {
    Random rand = new Random();
    int mas[] = new int [10];
    int mas2[] = new int [20]; 
    	for(int i = 0; i < 10; i++) 
    	{
    		
    		mas[i] = rand.nextInt(20);
//    		int a=5;
//			mas2[a] = mas[i]*2;
    		
    		System.out.print(mas[i] + " ");
//    		System.out.print(mas[i] + " " + mas2[a]);
        	
    	
    }
	
}
}