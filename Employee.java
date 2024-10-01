/*Write a program by creating an 'Employee' class having
 the following methods and print the final salary.
a.    'getInfo()' which takes the salary, number of hours of 
work per day of employee as parameter
b.    'AddSal()' which adds $10 to salary of the employee if
 it is less than $500.
c.    'AddWork()' which adds $5 to salary of employee if the
 number of hours of work per day is more than 6 hours.*/

package assignment4;

class Employee {
	private int sal;
	private int hour;

	Employee(int sal, int hour) {
		this.sal = sal;
		this.hour = hour;

	}

	public void getinfo() {
		System.out.println("salary" + sal);
		System.out.println("no of hours" + hour);
		System.out.println("as per company regulations");
		System.out.println("as per sal" + AddSal());
		System.out.println("as per hour" + AddWork());
		System.out.println("so final salary will be" + AddWork());

	}

	public int AddSal() {
		if (sal < 500)
			sal = sal + 10;
		return (sal);
	}

	public int AddWork() {
		if (hour > 6)
			sal = sal + 5;
		return (sal);
	}

	public static void main(String[] args) {
		Employee employee = new Employee(400, 8);
		employee.getinfo();

	}

}