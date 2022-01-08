package covid;

import java.util.Scanner;

public class covidUser {
	
	static covidUtils util = new covidUtils();
	
	public covidUser() {
		super();
	}
	
	public static void printMenu() {
		util.clrscr();
		util.mainDisplay("USER");
		
		System.out.println("\t\t1. Vaccine reservation.");
		System.out.println("\t\t2. Vaccine reservation cancellation");
		System.out.println("\t\t3. Check the reservation status of the vaccine.");
		System.out.println("\t\t4. Program exit\n");
		
		System.out.printf("[*] Select menu : ");
	}
	
	public static void menu() {
		
		Scanner sc = new Scanner(System.in);
		
		int select;
		
		while(true) {
			printMenu();
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				util.printExit();
				return;
			default:
				util.printError("You input wrong value !!");
				break;
			}
		}
	}
}
