import java.util.Scanner;

public class RevASen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a  string which you want to reverse");
		String s1=sc.nextLine();
	//	String s2=s1.toLowerCase();
		String s3="";
		 String a[]=s1.split(" ");
		
		for(int i=a.length-1;i>=0;i--) {
			
			System.out.print(a[i]+" ");
		}
		
		

	}

}
