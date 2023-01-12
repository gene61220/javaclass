
public class MaxMin {

	public static void main(String[] args) {
		int x[] = {1,2,-3,3,4,5,6,7,8,9};
		int max= x[0];
		int min=x[0];
		for(int i=0;i<x.length;i++)
	{if(x[i]>max)max=x[i];
	if(x[i]<min)min=x[i];}
		
		System.out.print("最大值 : "+ max + " , 最小值 : "+ min +"。");
	}

}
