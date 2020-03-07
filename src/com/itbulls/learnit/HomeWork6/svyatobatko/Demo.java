package com.itbulls.learnit.HomeWork6.svyatobatko;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
	//	Gift.getGift();
		run();	
	}
	
	
	
	public	static void run() {
	 ArrayList<Production> list = new ArrayList<Production>();
		list.add(new Chocolate("Lion", "Chocolate", 400, 35, 1200));
		list.add(new Cookies("Bounty", "Cookies", 225, 20, 15));
		list.add(new Cookies("Bounty", "Cookies", 315, 40, 15));
		
		
		
		
		Gift gift = new Gift(list);
		//gift.sortByWeight();
		//gift.sortByConsSuga();
		gift.sortByCost();
		System.out.println(gift);
		
		
		
		//String typeOfSort_1 = "price"; // Sort table by price candy
		//String typeOfSort_2 = "weight";// Sort table by weight candy
		//String typeOfSort_3 = "content sugar";// Sort table by content sugar in candy

		//MySortCandy.getSort(typeOfSort_1);
		
		//return list;
	
	}

	
}
