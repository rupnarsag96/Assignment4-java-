/*  Write a program to print the area and perimeter of a triangle having sides of 3, 4 
and 5 units by creating a class named 'Triangle' with parameter in its constructor.*/


package assignment4;

import java.lang.Math;

class Triangle {
	private double a;
	private double b;
	private double c;
	private double area1;
	private double peri;

	Triangle() {
		a = 0;
		b = 0;
		c = 0;
	}

	Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void display() {
		System.out.println("sides of triangle are " + a + b + c);
		System.out.println("Area of triangle is " + area1());
		System.out.println("perimeter of triangle is " + peri());
	}

	public double peri() {
		peri = a + b + c;
		return (peri);
	}

	public double area1() {
		double s = (a + b + c) / 2;
		area1 = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		return (area1);

	}

	public static void main(String[] args) {

		System.out.println("===============");
		Triangle triangle = new Triangle(3, 4, 5);
		triangle.display();

	}
}