package com.itbulls.learnit.car.HW5.svyatobatko;

class Auto extends Wheel   {
    String marka;   //���� ������    
    Auto() { //�����������
        super();
        marka = "����� �����";
    }
    Auto(int rad) { //����������� 2
        super(rad);
     
    }    
       
    Auto(String m, int rad, int e ) { //����������� 3
        super(rad);
        marka = m;
    }
    
    void ChangeTank(int newTank) { //�����������
        super.Tank = newTank;
    }
    
    void ChangeWheel(int newWheel) { //������� ������
        super.diam = newWheel;
    }
    
    String toMarka() { //����� ������� �����
       return marka;
    }
	@Override
	public String toString() {
		
		return "This car = " + marka + ", Wheel = " + diam + ", Engine = " + Tank+"." ;
	}   
    
    
}