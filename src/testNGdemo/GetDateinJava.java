package testNGdemo;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDateinJava {

	public static void main(String[] args) {

		// Create object of SimpleDateFormat class and decide the format
		generateDate();

	}

	public static void generateDate() {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

		//get current date time with Date()
		Date date = new Date();

		// Print the Date
		System.out.println("Current date and time is " +dateFormat.format(date));
		System.out.println("Current date and time is " +date);
		System.out.println("Random No is Java " +Math.round(Math.random()*1000));
	}

}