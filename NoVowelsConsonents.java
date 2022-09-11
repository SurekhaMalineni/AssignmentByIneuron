import java.util.Scanner;

class Vowels{
	
	private String s1;
	int vowelCount=0;
	int consonent=0;

	public Vowels(String s1) {
		
		this.s1 = s1;
	}
	
	
	void vowelsConsonent() {
		
	    s1.toLowerCase();
	   
		
		for(int i=0;i<=s1.length()-1;i++) {
			
		
		if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
		 {
			
			vowelCount++;
			
	     }
		
		else if(s1.charAt(i)>='a'&&s1.charAt(i)<='z'){
			
			consonent++;
		
		}
		}
		
		System.out.println("vowels count is:  "+ vowelCount );
		System.out.println("consonent count is :  "+ consonent );
		
		
	}	
	
}








public class NoVowelsConsonents {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter a string to count vowels and consonents");
			 Vowels v=new Vowels(sc.nextLine());
		 v.vowelsConsonent();
	}

}
