package com.itbulls.learnit.car.HW5.svyatobatko;

class Auto extends Wheel   {
    String marka;   //поле класса    
    Auto() { //конструктор
        super();
        marka = "новая марка";
    }
    Auto(int rad) { //конструктор 2
        super(rad);
     
    }    
       
    Auto(String m, int rad, int e ) { //конструктор 3
        super(rad);
        marka = m;
    }
    
    void ChangeTank(int newTank) { //заправиться
        super.Tank = newTank;
    }
    
    void ChangeWheel(int newWheel) { //сменить колесо
        super.diam = newWheel;
    }
    
    String toMarka() { //метод вывести марку
       return marka;
    }
	@Override
	public String toString() {
		
		return "This car = " + marka + ", Wheel = " + diam + ", Engine = " + Tank+"." ;
	}   
    
    
}