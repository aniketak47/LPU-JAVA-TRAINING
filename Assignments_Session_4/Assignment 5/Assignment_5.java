

//Assignment: 5. Sort the same arrays using the algo InsertionSort

public class Assignment_5 {

	public static void insertionSort(int[] arr) {
	    //write your code here
	    for(int i=1;i<arr.length;i++){
	        for(int j=i-1;j>=0;j--){
	            if(isGreater(arr,j,j+1)){
	                swap(arr,j,j+1);
	            }else{
	                break;
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

	  // return true if jth element is greater than ith element
	  public static boolean isGreater(int[] arr, int j, int i) {
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
			
			insertionSort(productPrices);
			display(productPrices);
			
			insertionSort(covidCases);
			display(covidCases);
			
			insertionSort(scores);
			display(scores);

		}

}
