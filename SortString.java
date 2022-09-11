
class SortImpl{
	
	private String s1;
	int temp;
	public SortImpl(String s1) {
		
		this.s1 = s1;
	}
	
	void sort() {
		
		char ch[]	=s1.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				
				if(ch[i]>ch[j]) {
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=(char) temp;
				}
							
			}
		}
		
		System.out.println(ch);
		
		
	}
	
	
	
	
	
	
}







public class SortString {

	public static void main(String[] args) {
		
		SortImpl sort=new SortImpl("surekha");
		sort.sort();

	}

}
