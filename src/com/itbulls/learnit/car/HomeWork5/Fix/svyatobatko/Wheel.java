package com.itbulls.learnit.car.HomeWork5.Fix.svyatobatko;

public class Wheel {
	private final double RADIUS = 15;
	private double radius;

	Wheel() {
		this.radius = RADIUS;
	}

	Wheel(double radius) {

		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
