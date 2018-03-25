package Java基础50题;
import java.util.*;

/*
 *  Lawliet.2018.3.22
 */
/*
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，
 * 求它在第10次落地时，共经过多少米？第10次反弹多高？ 
 */

public class example_10 {
	
	public static void ball(int times){
		double curHeight = 100;
		double totalHeight = 0;
		for(int i = 0; i < times; i++){
			totalHeight += 1.5 * curHeight;
			curHeight *= 0.5;
		}
		System.out.println("现在的高度是:" + curHeight + "米");
		System.out.println("一共经过" + totalHeight + "米");
	}
	
	public static void main(String[] args){
		int times;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入小球反弹次数：");
		times = in.nextInt();
		ball(times);
	}
	
}
