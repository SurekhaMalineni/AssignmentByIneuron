import java.util.Arrays;
import java.util.Scanner;

class TestAnagram
{
	
	private String s1,s2;
	
	TestAnagram(String s1,String s2){
		this.s1=s1;
		this.s2=s2;
	}
	
	
	
	void sortStrings() {
		
		if(s1.length()==s2.length()) {
			
		char ch1[]=s1.toLowerCase().toCharArray();
		char ch2[]=s2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		
	    if(Arrays.equals(ch1,ch2)) {
	    	
	    	System.out.println("given strings are anagram");
	    	
	    }
	    else { 
		
		 System.out.println("not anagram");
		}
		
	}
		else{ 
			System.out.println("not anagram");
		}
	
	
}

}




public class Anagram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string :");
		String s1=sc.nextLine();
		System.out.println("enter second string :");
		String s2=sc.nextLine();
		
		TestAnagram ta=new TestAnagram(s1,s2);
		ta.sortStrings();
		

	}

}
