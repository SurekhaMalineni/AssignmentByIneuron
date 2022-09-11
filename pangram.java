import java.util.Scanner;

public class pangram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to check pangram or not");
		String str=sc.nextLine();
		str.toLowerCase();
		char ch;
		boolean flag=true;
		int value[] = new int[26];
		for(int i=0;i<str.length();i++) {
			
			 ch= str.charAt(i);
			
			if(ch==' ')
				continue;
			
			if(ch>='a'&&ch<='z') {
				value[ch-'a']++;
			}
			
			
		}
		
		for(int i=0;i<value.length;i++) {
			
			if(value[i]==0) {
				flag=false;
				break;
			}
			
	}	

		if (flag)
			System.out.println(" pangram");
		else
			System.out.println("not pangram");
		
	
	}

}
