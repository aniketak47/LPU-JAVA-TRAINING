

//Assignment: 5. Explore labels with break and continue in Java and write a program for the same

public class Assignment_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= new int[]{100,18,21,30};
	     
        //Outer loop checks if number is multiple of 2
        OUTER:  //outer label
        for(int i = 0; i<numbers.length; i++){
            if(i % 2 == 0){
                System.out.println("Odd number: " + i + ", continue from OUTER label");
                continue OUTER;
            }
         
            INNER:
            for(int j = 0; j<numbers.length; j++){
                System.out.println("Even number: " + i + ", break  from INNER label");
                break INNER;
            }
        }
        
	}

}
