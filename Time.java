/* Write a class Time with three data members to store hr, 
min and seconds. Create two constructors and apply checks 
to set valid time. (hr<24, min<60, sec<60). Also create display 
function which displays all data members.*/

package assignment4;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;

	public Time(int hours, int minutes, int seconds) {
		setTime(hours, minutes, seconds);
	}

	public Time() {
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
	}

	public void setTime(int hours, int minutes, int seconds) {
		if (isValidTime(hours, minutes, seconds)) {
			this.hours = hours;
			this.minutes = minutes;
			this.seconds = seconds;
		} else {
			System.out.println("Invalid time provided. Setting time to 00:00:00.");
			this.hours = 0;
			this.minutes = 0;
			this.seconds = 0;
		}
	}

	private boolean isValidTime(int hours, int minutes, int seconds) {
		return (hours >= 0 && hours < 24) && (minutes >= 0 && minutes < 60) && (seconds >= 0 && seconds < 60);
	}

	public void display() {
		System.out.printf("Time: %02d:%02d:%02d\n", hours, minutes, seconds);
	}

	public static void main(String[] args) {
		Time time1 = new Time(12, 30, 45);
		time1.display();

		Time time2 = new Time(25, 10, 15);
		time2.display();

		Time time3 = new Time();
		time3.display();

		time3.setTime(23, 59, 59);
		time3.display();

		time3.setTime(24, 60, 60);
		time3.display();
	}

}