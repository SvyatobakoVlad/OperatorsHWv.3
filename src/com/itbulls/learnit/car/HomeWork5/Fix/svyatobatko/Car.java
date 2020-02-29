package com.itbulls.learnit.car.HomeWork5.Fix.svyatobatko;

public class Car {

	private String carName;
	private Wheel frontRight = new Wheel();
	private Wheel frontLeft = new Wheel();
	private Wheel rearRight = new Wheel();
	private Wheel rearLeft = new Wheel();
	private int fuel;
	private int maxFuel;
	private Engine engine = new Engine();

	Car(String name) {
		this.carName = name;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void changeWheel(double radius) {
		this.frontRight = new Wheel(radius);
		this.frontLeft = new Wheel(radius);
		this.rearRight = new Wheel(radius);
		this.rearLeft = new Wheel(radius);
		System.out.println("Wheels replaced successfully");
	}

	public void setTank(int tank) {
		this.maxFuel = tank;
		this.fuel = this.maxFuel;
		System.out.println("The car is filled with" + maxFuel + " liters");
	}

	public void moveCar() {
		int balance = this.fuel;
		if (balance <= 0) {
			System.out.println("Tank is empty");
		} else {
			this.engine.startEngine();
		}

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Car{");
		sb.append("carName='").append(carName).append('\'');
		sb.append(", frontRight=").append(this.frontRight.getRadius());
		sb.append(", frontLeft=").append(this.frontLeft.getRadius());
		sb.append(", rearRight=").append(this.rearRight.getRadius());
		sb.append(", rearLeft=").append(this.rearLeft.getRadius());
		sb.append('}');
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = carName.hashCode();
		result = prime * result + fuel;
		result = prime * result + maxFuel;
		result = prime * result + engine.hashCode();
		result = prime * result + frontRight.hashCode();
		result = prime * result + frontLeft.hashCode();
		result = prime * result + rearRight.hashCode();
		result = prime * result + rearLeft.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Car))
			return false;

		Car car = (Car) obj;

		if (maxFuel != car.maxFuel)
			return false;
		if (fuel != car.fuel)
			return false;
		if (!carName.equals(car.carName))
			return false;
		if (!engine.equals(car.engine))
			return false;
		if (!frontLeft.equals(car.frontLeft))
			return false;
		if (!frontRight.equals(car.frontRight))
			return false;
		if (!rearLeft.equals(car.rearLeft))
			return false;
		if (!rearRight.equals(car.rearRight))
			return false;

		return true;
	}

}
