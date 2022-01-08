package covid;

import java.util.Scanner;

public class covidRoot {
	
	private String rootID;
	private String rootPw;
	
	static covidUtils util = new covidUtils(); 
	
	public covidRoot() {
		super();
		this.rootID = "admin";
		this.rootPw = "admin";
	}
	
	public static void printMenu() {
		util.clrscr();
		util.mainDisplay("ROOT");
		
		System.out.println("\t\t1. Modify the administrator account.");
		System.out.println("\t\t2. Vaccine and reservation status check.");
		System.out.println("\t\t3. Add a reservation area.");
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
