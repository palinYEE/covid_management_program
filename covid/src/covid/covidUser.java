package covid;

import java.util.Scanner;

public class covidUser {
	
	static covidUtils util = new covidUtils();
	covidDataFormat userData = new covidDataFormat();
	covidDatabaseHandling data = new covidDatabaseHandling("test");
	
	public covidUser() {
		super();
	}
	
	public void printMenu() {
		util.clrscr();
		util.mainDisplay("USER");
		
		System.out.println("\t\t1. Vaccine reservation.");
		System.out.println("\t\t2. Vaccine reservation cancellation");
		System.out.println("\t\t3. Check the reservation status of the vaccine.");
		System.out.println("\t\t4. Program exit\n");
		
		System.out.printf("[*] Select menu : ");
	}
	// 백신 예약 함수 
	public void resolVaccine() {
		String name;
		int age;
		String area;
		String vaccine;
		int countData;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.printf("\t - Input booker name :  ");
		name = sc.nextLine();
		System.out.printf("\t - Input booker age : ");
		age = sc.nextInt();
		System.out.printf("\t - Input resolvation area : ");
		area = sc.nextLine();
		System.out.printf("\t - Input resolvation vaccine : ");
		vaccine = sc.nextLine();
		
		userData.setName(name);
		userData.setAge(age);
		userData.setArea(area);
		userData.setVaccine(vaccine);
		
		countData = data.countData("test");
		
		data.inputData(countData, userData);
		
		System.out.println("\t\tData count : " + countData);
	}
	
	// 백신 예약 취소 함수
	public void cancellationVaccine(){
		
		Scanner sc = new Scanner(System.in);

		String name;
		int age;

		System.out.printf("Please input name to cancel : ");
		name = sc.nextLine();
		System.out.printf("Please input age to cancel : ");
		age = sc.nextInt();
		
	}
	
	// 백신 예약 현황 보여주는 함수
	public void checkReservation(){

	}

	public void menu() {
		
		Scanner sc = new Scanner(System.in);
		
		int select;
		
		while(true) {
			printMenu();
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				resolVaccine();
				break;
			case 2:
				cancellationVaccine();
				break;
			case 3:
				checkReservation();
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