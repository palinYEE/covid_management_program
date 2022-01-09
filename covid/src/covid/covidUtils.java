package covid;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class covidUtils {

	public covidUtils() {
		super();
	}
	
	public static void printError(String in) {
		System.out.printf("[Error] %s\n", in);
	}
	
	public static void printExit() {
		System.out.println("Program exit");
	}
	
	public static void mainDisplay(String in) {
		System.out.println("===============================================");
		System.out.println("	    Covid Management Program ( " + in +" )");
		System.out.println("===============================================\n");
	}
	
	public String nowDate() {
		String resDate;
		String resTime;
		String res;
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		resDate = date.format(formatter);
		
		formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		resTime = time.format(formatter);
		
		res = resDate + " " + resTime;
		
		return res;
	}
	
	public static void clrscr(){
	    //Clears Screen in java1
	}
}