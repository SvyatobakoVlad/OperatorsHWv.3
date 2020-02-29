package com.itbulls.learnit.car.HomeWork5.Fix.svyatobatko;

public class Demo {

	public static void main(String[] args) {

		Car mitsuboshi = new Car("mitsuboshi");
		mitsuboshi.changeWheel(18);
		mitsuboshi.setTank(0);
		mitsuboshi.moveCar();

		System.out.println("Marka = " + mitsuboshi.getCarName());
		System.out.println(mitsuboshi.toString());
	}

}
