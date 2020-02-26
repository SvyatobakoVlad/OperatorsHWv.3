package com.itbulls.learnit.car.HW5.svyatobatko;

import com.itbulls.learnit.HW5.svyatobatko.Book;

public class DemoCar {

	public static void main(String[] args) {
		
		Auto a = new Auto("Chevrolet Camaro", 9, 5);
        a.ChangeWheel(15);//мен€ем колесо на 8.
        a.ChangeTank(10);
        a.Move(); //¬ызываем метод перемещени€
        String st = a.toMarka(); //возвращаем название авто и выводим
        System.out.println(st); 
        System.out.println(a);
        
	}
}
