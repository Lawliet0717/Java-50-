package Java基础50题;
import java.util.*;

/*
 *  Lawliet.2018.3.23
 */
/*
 * 给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
 */
public class example_24 {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个正整数：");
		String str = in.nextLine();
		System.out.println("这个数是" + str.length() + "位数");
		System.out.println("这个数的逆序是：");
		for(int i = str.length() - 1; i >= 0; i--){
			System.out.print(str.substring(i, i+1));//substring是左闭右开的
		}
	}
}
