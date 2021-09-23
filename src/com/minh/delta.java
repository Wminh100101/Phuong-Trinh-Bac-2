package com.minh;

class delta {
	float a;
	float b;
	float c;
	protected delta(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	protected float delta() {
		return b*b - 4*a*c;
	}
}
