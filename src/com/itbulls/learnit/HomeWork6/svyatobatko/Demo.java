package com.itbulls.learnit.HomeWork6.svyatobatko;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
	public	static ArrayList<Production> list = new ArrayList<Production>();
	public static void main(String[] args) {
		Gift.getGift();
//		System.out.println("Выбирете конфету " + "\n" + "1:MARS" + "\n" + "2:Lion" + "\n" + "3:Bounty" + "\n" + "4:Snik");
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
	
		
		/*
		 ArrayList<Production> list = new ArrayList<Production>(); 
		ArrayList<Production> setGift(){
			list.add(new Candy("Lion", 0.09, 1200));
			list.add(new Candy("Bounty", 15, 15));
		
			return list;
		}
		*/
		
		
	
		
		
		/*
		candies.add(new Candy("Snik", 10, 10));
		candies.add(new Candy("Mars", 0.1, 1000));
		candies.add(new Candy("Lion", 0.09, 1200));
*/


		/*
		 * switch(age) { case 1 :
		 * 
		 * System.out.println("добавил марк");
		 * 
		 * case 2 :
		 * 
		 * System.out.println("добавил лион");
		 * 
		 * }
		 */

		/*
		 * public static List<String> getGift (int ) { List<String> result = new
		 * ArrayList<>(); switch (getGift) {
		 * 
		 * 
		 * }
		 */
	}

	public static ArrayList<Production> setGift() {
		list.add(new Chocolate("Lion", "Chocolate", 30, 30, 1200));
		list.add(new Cookies("Bounty", "Cookies", 15, 30, 15));
		
		String typeOfSort_1 = "price"; // Sort table by price candy
		String typeOfSort_2 = "weight";// Sort table by weight candy
		String typeOfSort_3 = "content sugar";// Sort table by content sugar in candy

		MySortCandy.getSort(typeOfSort_1);
		
		return list;
	}

	

	
}
