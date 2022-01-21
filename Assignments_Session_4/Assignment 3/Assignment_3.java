

//Assignment: 3. GrayScale the image
//					for a pixel sum up all values and divide by 3
//				    eg: for pixel1 -> 12+45+78/3 -> 45
//					pixel1 = {45, 45, 45}
//					do it for all pixels on the image
// 			   Hint: Use For Loops :)

public class Assignment_3 {
	
	public static void grayScale(int[][][] image) {
		for(int i=0;i<image.length;i++) {
			for(int j=0;j<image[0].length;j++) {
				int sum=0;
				for(int k=0;k<image[i][j].length;k++) {
					sum+=image[i][j][k];
				}
				
				int val=sum/3;
				
				for(int k=0;k<image[i][j].length;k++) {
					image[i][j][k]=val;
				}
			}
		}
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
	 						{pixel1, pixel2, pixel3},
	 						{pixel4, pixel5, pixel6},
	 						{pixel7, pixel8, pixel9},
	 					};
	 	
	 	
	 	System.out.println("Image Before GrayScale : ");
	 	display(image);
	 	
	 	grayScale(image);	 
	 	System.out.println();
	 	
	 	System.out.println("Image After GrayScale : ");
	 	display(image);
	 	
	 	

	 	

	}

}
