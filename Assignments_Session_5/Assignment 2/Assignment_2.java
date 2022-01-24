

// Assignment - 2.  Create an Array of File Names as String Array
//					And from the Array Filter Various files as per thier extensions
//					eg : String[] files = {"song1.mp3", "hello.txt", "image.png"//.....};
//						 Use the String build in methods and simply print the data extensions wise 
//						 with the methods: eg: printMP3Files{//...}, printPNGFiles{//....}
//						 try using overloading here :)

public class Assignment_2 {
	static void printMP3Files(String[] arr){
		for(String s:arr) {
			String[] fileName=s.split(",");
			for(String str:fileName) {
				int idx=str.indexOf('.');
				String ext=str.substring(idx+1);
				
				if(ext.equals("mp3")) {
					System.out.println("This is MP3 File with FileName : "+str.substring(0,idx));
				}
				
			}
		}
	}
	
	static void printImgFiles(String[] arr) {
		for(String s:arr) {
			String[] fileName=s.split(",");
			for(String str:fileName) {
				int idx=str.indexOf('.');
				String ext=str.substring(idx+1);
				
				if(ext.equals("jpg")) {
					System.out.println("This is JPG File with FileName : "+str.substring(0,idx));
				}else if(ext.equals("png")) {
					System.out.println("This is PNG File with FileName : "+str.substring(0,idx));
				}
				
			}
		}
	}
	
	static void printPDFFiles(String[] arr) {
		for(String s:arr) {
			String[] fileName=s.split(",");
			for(String str:fileName) {
				int idx=str.indexOf('.');
				String ext=str.substring(idx+1);
				
				if(ext.equals("pdf")) {
					System.out.println("This is PDF File with FileName : "+str.substring(0,idx));
				}
				
			}
		}
	}
	
	static void printMP4Files(String[] arr) {
		for(String s:arr) {
			String[] fileName=s.split(",");
			for(String str:fileName) {
				int idx=str.indexOf('.');
				String ext=str.substring(idx+1);
				
				if(ext.equals("mp4")) {
					System.out.println("This is MP4 File with FileName : "+str.substring(0,idx));
				}
				
			}
		}
	}
	
	static void printTXTFiles(String[] arr) {
		for(String s:arr) {
			String[] fileName=s.split(",");
			for(String str:fileName) {
				int idx=str.indexOf('.');
				String ext=str.substring(idx+1);
				
				if(ext.equals("txt")) {
					System.out.println("This is Txt File with FileName : "+str.substring(0,idx));
				}
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"song1.mp3", "hello.txt", "ak.pdf", "image1.png", "image2.jpg","video.mp4"}; 
		
		printMP3Files(arr);
		printImgFiles(arr);
		printPDFFiles(arr);
		printMP4Files(arr);
		printTXTFiles(arr);
		
	}

}
