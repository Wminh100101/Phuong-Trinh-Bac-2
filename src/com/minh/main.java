package com.minh;

import java.util.Scanner;

class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap 3 so a,b,c");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		delta delta = new delta(a, b, c);
		tinhtoan tinhtoan = new tinhtoan(a, b, c, delta.delta());
		tinhtoan.hienthi();

	}

}
