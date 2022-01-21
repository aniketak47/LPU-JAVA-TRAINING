
//Assignment: 4. Sort the same arrays using the algo BubbleSort

public class Assignment_4 {
	
	public static void bubbleSort(int[] arr) {
	    //write your code here
	    for(int itr=1;itr<=arr.length-1;itr++){
	        for(int j=0;j<arr.length-itr;j++){
	            if(isSmaller(arr,j+1,j)){
	                swap(arr,j+1,j);
	            }
	        }
	    }
	    
	}
	
	// used for swapping ith and jth elements of array
	  public static void swap(int[] arr, int i, int j) {
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	  }

	  // return true if ith element is smaller than jth element
	  public static boolean isSmaller(int[] arr, int i, int j) {
	    if (arr[i] < arr[j]) {
	      return true;
	    } else {
	      return false;
	    }
	  }
	  
	 
	public static void display(int[] arr) {
		for(int ele:arr) {
			System.out.print(ele+ " ");		
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] productPrices = {1200, 4500, 3200, 4300, 1500};
		int[] covidCases = {512433, 734667, 346762, 989823, 877873, 97632, 142331};
		int[] scores = {70, 88, 12, 34, 56, 80, 90, 95, 34, 35, 16};
		
		bubbleSort(productPrices);
		display(productPrices);
		
		bubbleSort(covidCases);
		display(covidCases);
		
		bubbleSort(scores);
		display(scores);

	}

}
