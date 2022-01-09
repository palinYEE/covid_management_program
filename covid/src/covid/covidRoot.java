package covid;

import java.util.Scanner;

public class covidRoot {
	
	private String rootID;
	private String rootPw;
	private String createDate;
	private boolean loginStatus;
	
	static covidUtils util = new covidUtils(); 
	
	public String getRootID() {
		return rootID;
	}

	public void setRootID(String rootID) {
		this.rootID = rootID;
	}

	public String getRootPw() {
		return rootPw;
	}

	public void setRootPw(String rootPw) {
		this.rootPw = rootPw;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

// ====================================================================

	public covidRoot() {
		super();
		this.rootID = "admin";
		this.rootPw = "admin";
		this.createDate = util.nowDate();
	}
	
	public boolean login() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("\t\t - Input ID : ");
		String id = sc.nextLine();
		System.out.printf("\t\t - Input PW : ");
		String pw = sc.nextLine();
		
		if(!id.equals(this.rootID)) {
			util.printError("You input wrong ID !!");
			return false;
		}
		if(!pw.equals(this.rootPw)) {
			util.printError("You input wrong PW !!");
			return false;
		}
		this.loginStatus = true;
		return true;
	}
	
	public void printMenu() {
		util.clrscr();
		util.mainDisplay("ROOT");
		System.out.println("\tPlease login");
		if(!this.loginStatus) {
			boolean loginCheck = login();
			if(loginCheck == false) {
				util.printError("login fail");
				return;
			}
		}
		System.out.println("\tEnter root menu ^_^ \n");
		System.out.println("\t\t1. Modify the administrator account.");
		System.out.println("\t\t2. Vaccine and reservation status check.");
		System.out.println("\t\t3. Add a reservation area.");
		System.out.println("\t\t4. Program exit\n");
		
		System.out.printf("[*] Select menu : ");
	}
	
	// 관리자 계정 수정 함수
	public void modifyAdmin() {
		String modifyID;
		String modifyPW;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n*** Original information");
		System.out.println("\t - ID : " + getRootID());
		System.out.println("\t - PW : " + getRootPw());
		System.out.println("\t - Create Date : " + getCreateDate());
		System.out.printf("[*] Change ID and PW? (y/n) : ");
		
		String check = sc.nextLine();
		
		if(check.equals("y")) {
			while(true) {
				System.out.printf("\t [*] Input ID : ");
				modifyID = sc.nextLine();
				System.out.printf("\t [*] Input PW : ");
				modifyPW = sc.nextLine();
				
				System.out.println("[*] Please check id/pw ");
				System.out.println("\t - ID : "+ modifyID);
				System.out.println("\t - PW : "+ modifyPW);
				System.out.printf(" - Is the ID and password you entered right? (y/n) : ");
				check = sc.nextLine();
				
				if(check.equals("y")) {
					this.rootID = modifyID;
					this.rootPw = modifyPW;
					this.createDate = util.nowDate();
					return;
				}
			}
		}
		
	}
	
	public void menu() {
		this.loginStatus = false;
		Scanner sc = new Scanner(System.in);
		
		int select;
		
		while(true) {
			printMenu();
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				modifyAdmin();
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
