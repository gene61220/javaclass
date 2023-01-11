
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hours = 101 , salary = 100;
		float under60 =1 ;
		double uper60= 1.25 ;
		double up80= 1.5 ;
		double y = (hours % 80 ) * up80 * salary + (hours % 60- hours % 80 )* uper60 *salary + (hours % 60)*under60*salary;
		System.out.println("本月工作時數共 "+hours+" 小時，總薪資為 "+y+" 元");
	}
}