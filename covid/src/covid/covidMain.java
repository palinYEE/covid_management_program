package covid;

import java.util.Scanner;

public class covidMain {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		covidRoot root = new covidRoot();
		covidUser user = new covidUser();
		covidUtils util = new covidUtils();
		
		int select;
		while(true) {
			
			util.mainDisplay("MAIN");
			
			System.out.println("\t\t1. Root mode");
			System.out.println("\t\t2. User mode");
			System.out.println("\t\t3. Program exit\n");
			System.out.printf("[*] Select menu : ");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				root.menu();
				break;
			case 2:
				user.menu();
				break;
			case 3: 
				util.printExit();
				System.exit(0);
			default:
				util.printError("You input wrong value !!");
				break;

			}
		}
	}

}