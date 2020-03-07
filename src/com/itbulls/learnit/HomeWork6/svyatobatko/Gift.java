package com.itbulls.learnit.HomeWork6.svyatobatko;

import java.util.ArrayList;
import java.util.List;





public class Gift {
	
	public static void getGift() {
	Gift gift = new Gift();
	ArrayList<Production> list = Demo.setGift();
	gift.showGift(list);
	}
	
	private void showGift(ArrayList<Production> list) {
		System.out.println(list.toString());
	}


	
	
	
	 }

