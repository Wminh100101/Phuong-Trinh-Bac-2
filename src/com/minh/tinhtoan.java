package com.minh;

class tinhtoan {
	float a;
	float b;
	float c;
	float delta;
	protected tinhtoan(float a, float b, float c, float delta) {
		this.a =a ;
		this.b =b;
		this.c = c;
		this.delta = delta;
	}
	protected void hienthi() {
		if  (a==0) {
			System.out.println("Khong phai phuong trinh bac 2");
			System.exit(0);
		}
		if (delta < 0) {
			System.out.print("Phuong trinh vo  nghiem");
			System.exit(0);
		}
		if (delta == 0) {
			System.out.print("phuong trinh co nghiem kep:"+ -(b/(2*a)));
			System.exit(0);
		}
		if (delta > 0) {
			System.out.print("Phuong trinh co 2 nghiem phan biet x1:"+  -(b + Math.sqrt(delta))/(2*a) +" va x2:"+ -(b - Math.sqrt(delta))/(2*a));
		}
	}
	
}
