// Assignment: 1. Implement Ternary Operators if possible in above scenario


import java.util.Scanner;


public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // Scanner Object Construction
		
		System.out.println("Enter an Amount: ");
		double amount = scanner.nextDouble(); // to read a double
		
		System.out.println("Enter Promo Code: ");
		//String promoCode = scanner.nextLine(); // to read a String
		int promoCode = scanner.nextInt();
		
		scanner.close(); // release the memory resources
		
		int JUMBO = 101;   // Flat 50% off for the items worth 200 or more
		int ZOMHELLO = 201; // Flat 60% off for the items worth 159 or more upto 120
		
//		String message = (amount>=159) ? "You will get Dicsount" : "You will get Dicsount";
//		System.out.println(message);
		
		
		double discount = 0;
		
		if(promoCode == JUMBO) {
			
			// Nested if/else
			if(amount >= 200) {
				discount = 0.5 * amount;
				System.out.println("Discount is: "+discount);
				System.out.println("Promo Code JUMBO Applied Successfully");
			}else {
				System.out.println("Amount is Lesser. Please add items worth "+(200-amount)+" more");
			}
			
		}else if(promoCode == ZOMHELLO) {
			
			// Nested if/else
			if(amount >= 159) {
				discount = 0.6 * amount;
				
				if(discount >= 120) {
					discount = 120;
				}
				
				System.out.println("Discount is: "+discount);
				
				System.out.println("Promo Code ZOMHELLO Applied Successfully");
			}else {
				System.out.println("Amount is Lesser. Please add items worth "+(159-amount)+" more");
			}
			
		}else {
			System.out.println("Invalid Promo Code");
		}
		
		
	}

}




