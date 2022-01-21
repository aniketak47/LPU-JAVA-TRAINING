

//Assignment: 1. Rotate the Image to Right -> 90 degrees

public class Assignment_1 {
	
	public static void transpose(int[][][] image) {
		for(int i=0;i<image.length;i++) {
			for(int j=i;j<image.length;j++) {				
				int[] temp=image[i][j];
				image[i][j]=image[j][i];
				image[j][i]=temp;
			}
		}
	}
	
	public static void reverse(int[][][] image) {
		for(int i=0;i<image.length;i++) {
			int start=0;
			int end=image[i].length-1;
			
			while(start<=end) {
				int[] temp=image[i][start];
				image[i][start]=image[i][end];
				image[i][end]=temp;
				
				start++;
				end--;
			}
		}
	}
	
	public static void rotate(int[][][] image) {
		transpose(image);
		reverse(image);
	}
	
	public static void display(int[][][] image) {
		for(int i=0;i<image.length;i++) {
			for(int j=0;j<image[0].length;j++) {
				for(int k=0;k<image[i][j].length;k++) {
					System.out.print(image[i][j][k]+",");
				}
				System.out.print("\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		int[] pixel1 = {12, 45, 78};
	 	int[] pixel2 = {34, 12, 90};
	 	int[] pixel3 = {0, 234, 56};
	 	
	 	int[] pixel4 = {13, 14, 15};
	 	int[] pixel5 = {16, 17, 18};
	 	int[] pixel6 = {19, 20, 21};
	 	
	 	int[] pixel7 = {31, 32, 33};
	 	int[] pixel8 = {34, 35, 36};
	 	int[] pixel9 = {37, 38, 39};
	 	
	 	// Representation of an Image
	 	int[][][] image = {
	 						//0			1		2
	 						{pixel1, pixel2, pixel3},//0
	 						{pixel4, pixel5, pixel6},//1
	 						{pixel7, pixel8, pixel9},//2
	 					};
	 	
	 	
	 	System.out.println("Before Rotating the image i.e Original image : ");
	 	display(image);
	 	
	 	rotate(image);
	 	System.out.println();
	 	
	 	System.out.println("After Rotating the image to Right i.e 90 degrees : ");
	 	display(image);
	 	

	}
	

}
