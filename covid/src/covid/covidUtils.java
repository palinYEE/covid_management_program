package covid;

import java.io.IOException;

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
	
	public static void clrscr(){
	    //Clears Screen in java1
	}
}
