import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a  string which you want to reverse");
		String s1=sc.next();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		
		
		

	}

	private static String charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
