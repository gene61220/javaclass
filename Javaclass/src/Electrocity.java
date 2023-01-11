
public class Electrocity {

	public static void main(String[] args) {
		int elecuse = 920, oper = 0;//用電度數，型態0=一般 1=商業
		double money;
		switch (oper) {
		case 0:
			money = (elecuse % 1000) * 6.41 + (elecuse % 700 - elecuse % 1000) * 5.66
					+ (elecuse % 500 - elecuse % 700) * 4.80 + (elecuse % 330 - elecuse % 500) * 3.52
					+ (elecuse % 120 - elecuse % 330) * 2.38 + (elecuse - elecuse % 120) * 1.63;
			System.out.println("你是一般用電，共使用 "+elecuse+" 度電，總金額為 " + Math.round(money*100.0)/100.0 + " 元");
			break;
		case 1:
			money = (elecuse % 1500) * 6.43 + (elecuse % 700 - elecuse % 1500) * 4.25
					+ (elecuse % 330 - elecuse % 700) * 3.55 + (elecuse - elecuse % 330) * 2.53;
			System.out.println(money + "元");
			System.out.println("你是商業用電，共使用 "+elecuse+" 度電，總金額為" + money + "元");
			break;
		}

	}

}