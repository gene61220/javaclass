
public class refund {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalprice = 2307;//輸入 客人商品總額
		int customergive = 3500;//輸入 客人付的錢
		//
		//
		int co1=0, co5=0, co10=0, co50 = 0 , co100=0 , co500=0;
		int r= customergive-totalprice; 
		if(r>=0) {
		if(r>1000) {int x; x= r/1000;r=r%1000; System.out.println("請先還"+x+
				"張 1000元紙鈔給客人"+"\n---------------------------");
		System.out.println("總計金額為 "+totalprice+ " 元，收您 "+ (customergive-x*1000)+" 元，找您零錢如下");}
		else{;}
		while(r>=500) {r-=500;co500++;}
		while(r>=100) {r-=100;co100++;}
		while(r>=50) {r-=50;co50++;}
		while(r>=10) {r-=10;co10++;}
		while(r>=5) {r-=5;co5++;}
		while(r>=1) {co1= r;r=0;}
		
		if(co500!=0)System.out.println("500 元-紙鈔 共 "+ co500 +" 張");System.out.println("100 元-紙鈔 共 "+ co100 +" 張");
		if(co100!=0)System.out.println("100 元-紙鈔 共 "+ co100 +" 張");
		if(co50!=0)System.out.println(" 50 元-紙鈔 共 "+ co50 +" 張");
		if(co10!=0)System.out.println(" 10 元-硬幣 共 "+ co10 +" 張");
		if(co5!=0)System.out.println("  5 元-硬幣 共 "+ co5 +" 張");
		if(co1!=0)System.out.println("  1 元-硬幣 共 "+ co1 +" 張");
		}
		else{System.out.println("客人，錢不夠哦～");};
	}

}
