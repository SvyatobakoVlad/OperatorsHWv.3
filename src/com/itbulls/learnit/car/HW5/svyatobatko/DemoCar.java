package com.itbulls.learnit.car.HW5.svyatobatko;

import com.itbulls.learnit.HW5.svyatobatko.Book;

public class DemoCar {

	public static void main(String[] args) {
		
		Auto a = new Auto("Chevrolet Camaro", 9, 5);
        a.ChangeWheel(15);//������ ������ �� 8.
        a.ChangeTank(10);
        a.Move(); //�������� ����� �����������
        String st = a.toMarka(); //���������� �������� ���� � �������
        System.out.println(st); 
        System.out.println(a);
        
	}
}
