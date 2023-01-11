
public class LeapYear {
	public static void main(String[] args) {
		final int year = 2023 ;
		int a = year % 400, b = year % 100 , c = year % 4;
		if(a==0)
		{System.out.println("閏年");}
		else {
			if(b==0 && a!=0 ){ 
			System.out.println("不閏年");
			}
			 else 
			 {if(c==0){
				 System.out.println("閏年");
				 }
			 else {
				 System.out.println("不是閏年");
				 };}}}}
			
		
		
		
	
	