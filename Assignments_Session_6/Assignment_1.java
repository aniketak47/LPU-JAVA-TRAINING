
public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str1=new StringBuffer("My Name Is Aniket kumar");
        StringBuilder str2=new StringBuilder("My Name Is Aniket kumar");

        System.out.println("--------------String Buffer-------------");
        System.out.println(str1.append(234));
        System.out.println(str1.capacity());
        System.out.println(str1.reverse());

        System.out.println("-------------String Builder-------------");
        System.out.println(str2.append(245));
        System.out.println(str2.capacity());
        System.out.println(str2.reverse());

	}

}

