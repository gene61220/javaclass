package loop;

public class Rabbit {

	public static void main(String[] args) {
		boolean y=false;
		int i = 1;
		while(y==false) {
			if(i%3==1&&i%5==3&&i%7==2)y=true;
			else i++;
		}
		System.out.print(i);
		

	}

}
