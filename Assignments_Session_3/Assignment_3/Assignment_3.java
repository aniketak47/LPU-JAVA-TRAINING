
//Assignment: 3. implement a use case i.e. Book a Cab by taking OLA/Uber as a case study

import java.util.Scanner;


public class Assignment_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Choose the Vehicle \uD83D\uDE97 From given list :");
		System.out.println("1. Auto\t\u20b9 100\t\t5. Mini\t\u20b9 200");
		System.out.println("2. Bike\t\u20b9 150\t\t6. SUV\t\u20b9 350");
		
		System.out.println("3. Share\u20b9 230\t\t7. LUX\t\u20b9 300");
		System.out.println("4. Micro\u20b9 400\t\t8. E-Rick\u20b9 175");
		
		System.out.println("Type the Integer Value of the Vehicle....");
		
		int vehicle = scn.nextInt();
		
		System.out.println("Enter your E-Wallet ammount ");
		int eWallet = scn.nextInt();
		
		if(eWallet<100) {
			System.out.println("Insufficient Balance!!\nPlease add atleast \u20b9 "+(100-eWallet)+" to continue the ride....");
			return;
		}
		
		if(vehicle==1) {
			if(eWallet<100) {
				System.out.println("Insufficient Balance!!\nPlease add \u20b9 "+(100-eWallet)+" to continue this ride....");
			}else {
				System.out.println("Congratulation!!! You have Successfully booked the ride....");
			}
		}else if(vehicle==2) {
			if(eWallet<150) {
				System.out.println("Insufficient Balance!!\nPlease add \u20b9 "+(150-eWallet)+" to continue this ride....\nOtherwise Pick the other vehicle!");
			}else {
				System.out.println("Congratulation!!! You have Successfully booked the ride....");
			}
		}else if(vehicle==3) {
			if(eWallet<230) {
				System.out.println("Insufficient Balance!!\nPlease add \u20b9 "+(230-eWallet)+" to continue this ride....\nOtherwise Pick the other vehicle!");
			}else {
				System.out.println("Congratulation!!! You have Successfully booked the ride....");
			}
		}else if(vehicle==4) {
			if(eWallet<400) {
				System.out.println("Insufficient Balance!!\nPlease add \u20b9 "+(400-eWallet)+" to continue this ride....\nOtherwise Pick the other vehicle!");
			}else {
				System.out.println("Congratulation!!! You have Successfully booked the ride....");
			}
		}else if(vehicle==5) {
			if(eWallet<200) {
				System.out.println("Insufficient Balance!!\nPlease add \u20b9 "+(200-eWallet)+" to continue this ride....\nOtherwise Pick the other vehicle!");
			}else {
				System.out.println("Congratulation!!! You have Successfully booked the ride....");
			}
		}else if(vehicle==6) {
			if(eWallet<350) {
				System.out.println("Insufficient Balance!!\nPlease add \u20b9 "+(350-eWallet)+" to continue this ride....\nOtherwise Pick the other vehicle!");
			}else {
				System.out.println("Congratulation!!! You have Successfully booked the ride....");
			}
		}else if(vehicle==7) {
			if(eWallet<300) {
				System.out.println("Insufficient Balance!!\nPlease add \u20b9 "+(300-eWallet)+" to continue this ride....\nOtherwise Pick the other vehicle!");
			}else {
				System.out.println("Congratulation!!! You have Successfully booked the ride....");
			}
		}else if(vehicle==8) {
			if(eWallet<175) {
				System.out.println("Insufficient Balance!!\nPlease add \u20b9 "+(175-eWallet)+" to continue this ride....\nOtherwise Pick the other vehicle!");
			}else {
				System.out.println("Congratulation!!! You have Successfully booked the ride....");
			}
		}else {
			System.out.println("Invalid Input!!!!");
			System.out.println("Please Pick the valid Vehicle for Ride...");
		}
	}

}
