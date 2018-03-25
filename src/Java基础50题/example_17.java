package Java基础50题;
import java.util.*;

/*
 *  Lawliet.2018.3.23
 */
/*
 * 猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个 
 * 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
 * 以后每天早上都吃了前一天剩下的一半零一个。
 * 到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。 
 */
public class example_17 {
	
	public static int monkeyEatPeach(int days){
		int last = 1;
		for(int i = 1; i < days; i++){
			last = (last + 1) * 2;
		}
		return last;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入天数");
		int days = in.nextInt();
		int res = monkeyEatPeach(days);
		System.out.println("第一天时一共有" + res + "个桃子");
	}
		
}
