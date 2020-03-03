package com.itbulls.learnit.HomeWork6.svyatobatko;

public class Production {
	private String name; //имя
	private String type; //тип конфетки
	private double cost; //?
	private int weight; //вес
	private double consSuga; //содиржание сахара
	
	public Production(String name, String type, double cost, int weight, double consSuga) {
		
	
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public double getconsSuga() {
		return consSuga;
	}

	public void setconsSuga(double consSuga) {
		this.consSuga = consSuga;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(consSuga);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Production other = (Production) obj;
		if (Double.doubleToLongBits(consSuga) != Double.doubleToLongBits(other.consSuga))
			return false;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Production [name=" + name + ", type=" + type + ", cost=" + cost + ", weight=" + weight + ", consSuga="
				+ consSuga + "]" + "\n";
	}
	
	
	
}
