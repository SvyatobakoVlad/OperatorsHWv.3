package com.itbulls.learnit.HomeWork6.svyatobatko;

import java.util.*;

public class Gift {
	private static ArrayList<Production> list = new ArrayList<Production>();

	public Gift(ArrayList<Production> list) {
		this.list = list;
	}

	public void sortByWeight() {
		Collections.sort(list, new Comparator<Production>() {
			public int compare(Production o1, Production o2) {
				if (o1.getWeight() >= o2.getWeight()) {
					return 1;
				} else {
					return -1;
				}
			}
		});

	}

	public void sortByCost() {
		Collections.sort(list, new Comparator<Production>() {
			public int compare(Production o1, Production o2) {
				if (o1.getCost() >= o2.getCost()) {
					return 1;
				} else {
					return -1;
				}
			}
		});
	}

	public void sortByConsSuga() {
		Collections.sort(list, new Comparator<Production>() {
			public int compare(Production o1, Production o2) {
				if (o1.getconsSuga() >= o2.getconsSuga()) {
					return 1;
				} else {
					return -1;
				}
			}
		});
	}

	@Override
	public String toString() {
		String result = "Box: " + "\n";
		for (Production production : list) {
			result += production.toString() + "\n";
		}
		return result;
	}

	/*
	 * public static void getGift() { Gift gift = new Gift(); ArrayList<Production>
	 * list = Demo.setGift(); gift.showGift(list); }
	 * 
	 * private void showGift(ArrayList<Production> list) {
	 * System.out.println(list.toString()); }
	 */

}
