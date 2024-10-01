/* Create a class called 'Matrix' containing constructor that 
initializes the number of rows and number of columns of a new
 Matrix object. The Matrix class has the following information:
a.    number of rows of matrix
b.    number of columns of matrix
c.    elements of matrix in the form of 2D array
The Matrix class has methods for each of the following:
a.    get the number of rows
b.    get the number of columns
c.    set the elements of the matrix at given position (i,j)
d.    adding two matrices. If the matrices are not addable, "Matrices 
cannot be added" will be displayed.*/

package assignment4;

import java.util.Scanner;

public class Matrix {
	private int rows;
	private int columns;
	private int[][] elements;

	public Matrix(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.elements = new int[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setElement(int i, int j, int value) {
		if (i >= 0 && i < rows && j >= 0 && j < columns) {
			elements[i][j] = value;
		} else {
			System.out.println("Invalid index");
		}
	}

	public Matrix add(Matrix other) {
		if (this.rows != other.rows || this.columns != other.columns) {
			System.out.println("Matrices cannot be added");
			return null;
		}
		Matrix result = new Matrix(this.rows, this.columns);
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.columns; j++) {
				result.elements[i][j] = this.elements[i][j] + other.elements[i][j];
			}
		}
		return result;
	}

	public void display() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(elements[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of rows for the first matrix: ");
		int rows1 = scanner.nextInt();
		System.out.print("Enter number of columns for the first matrix: ");
		int columns1 = scanner.nextInt();
		Matrix matrix1 = new Matrix(rows1, columns1);

		System.out.println("Enter elements of the first matrix:");
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < columns1; j++) {
				matrix1.setElement(i, j, scanner.nextInt());
			}
		}

		System.out.print("Enter number of rows for the second matrix: ");
		int rows2 = scanner.nextInt();
		System.out.print("Enter number of columns for the second matrix: ");
		int columns2 = scanner.nextInt();
		Matrix matrix2 = new Matrix(rows2, columns2);

		System.out.println("Enter elements of the second matrix:");
		for (int i = 0; i < rows2; i++) {
			for (int j = 0; j < columns2; j++) {
				matrix2.setElement(i, j, scanner.nextInt());
			}
		}

		Matrix sum = matrix1.add(matrix2);
		if (sum != null) {
			System.out.println("Result of adding the two matrices:");
			sum.display();
		}
	}

}