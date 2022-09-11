import java.util.Scanner;

public class Repeatedcharaccter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		
		char c[]=str.toCharArray();
		
		
		for(int i=0;i<c.length;i++) {
			int count=1;
			for(int j=0;j<c.length;j++) {
				if(c[i]==c[j]&&c[i]!=' ') {
					count++;
					c[j]='0';
				}
				
			}
//		System.out.println(count);
		if(count>1) {
		
			System.out.print(c[i]);
		}
		}	
		
				

	}

}
