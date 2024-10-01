/*Print the sum, difference and product of two complex numbers by creating a class, 
named 'Complex' with separate methods for each operation whose real and imaginary
 parts are entered by user. Use Constructors to initialize the data members.*/

package assignment4;

import java.util.Scanner;

public class Complex {

	private double real;
	private double imaginary;

	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public Complex add(Complex other) {
		return new Complex(real + other.real, imaginary + other.imaginary);
	}

	public Complex subtract(Complex other) {
		return new Complex(real - other.real, imaginary - other.imaginary);
	}

	public Complex multiply(Complex other) {
		double realPart = real * other.real - imaginary * other.imaginary;
		double imaginaryPart = real * other.imaginary + imaginary * other.real;
		return new Complex(realPart, imaginaryPart);
	}

	@Override
	public String toString() {
		return real + (imaginary >= 0 ? " + " : " - ") + Math.abs(imaginary) + "i";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the real part of the first complex number: ");
		double real1 = scanner.nextDouble();
		System.out.print("Enter the imaginary part of the first complex number: ");
		double imaginary1 = scanner.nextDouble();
		Complex complex1 = new Complex(real1, imaginary1);

		System.out.print("Enter the real part of the second complex number: ");
		double real2 = scanner.nextDouble();
		System.out.print("Enter the imaginary part of the second complex number: ");
		double imaginary2 = scanner.nextDouble();
		Complex complex2 = new Complex(real2, imaginary2);

		System.out.println("Sum: " + complex1.add(complex2));
		System.out.println("Difference: " + complex1.subtract(complex2));
		System.out.println("Product: " + complex1.multiply(complex2));

	}

}