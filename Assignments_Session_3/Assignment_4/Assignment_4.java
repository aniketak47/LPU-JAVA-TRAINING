
// Assignment: Place the n-queens on the chessboard by taking input form the User
//			   eg: User says row -> 1 and col -> 1 as input -> replace it with queen
//			   a total of 4 inputs can be taken to place 4 queens in the chessboard
//			   no queen can be placed in the same row again or same column again :)
//			   Hint: use a do, while loop and make sure not to take more than 4 queens positions 

import java.util.Scanner;

public class Assignment_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		char blackSquare = '\u25A1';	// 1
		char whiteSquare = '\u25A0';	// 0
		char queen = '\u2655';
		

		int input = 4;
		
		int[] rowA=new int[8];
        int[] colA=new int[8];
		
		while(input-->0) {
			System.out.println("Enter Row : ");
			int row=scn.nextInt();
			
			System.out.println("Enter Column : ");
			int col=scn.nextInt();
			
			
			if(row<0 || row>=8 || col<0 || col>=8) {
				System.out.println("Invalid Row & Column!!!");
				input++;
				System.out.println("Please Enter again...");
				continue;
			}
			
			if(rowA[row]==1 || colA[col]==1){
                System.out.println("Already Queen Placed either in this Row Or Column....");
                System.out.println("Please Enter again...");
                input++;
                continue;
            }
			
			rowA[row]=1;
            colA[col]=1;			
			
			
			
			for(int i=0;i<8;i++) {
				for(int j=0;j<8;j++) {	
					
					if(i%2==0) {
						if(j%2==0) {
							if(i==row && col==j) {								
								System.out.print(queen+"  ");
							}else {								
								System.out.print(whiteSquare+"  ");
							}
						}else {
							if(i==row && col==j) {
								System.out.print(queen+"  ");
							}else {								
								System.out.print(blackSquare+"  ");
							}
						}
					}else {
						if(j%2==0) {
							if(i==row && col==j) {
								System.out.print(queen+"  ");
							}else {								
								System.out.print(blackSquare+"  ");
							}
						}else {
							if(i==row && col==j) {
								System.out.print(queen+"  ");
							}else {								
								System.out.print(whiteSquare+"  ");
							}
						}
					}
				}
				System.out.println();
			}
		}
	}


}
