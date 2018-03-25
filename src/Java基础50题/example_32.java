package Java基础50题;

import java.util.Scanner;

/*
 *  Lawliet.2018.3.24
 */
/*
 * 取一个整数a从右端开始的4～7位
 */
public class example_32 {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		long num = in.nextLong();
		String str = Long.toString(num);
		char[] ch = str.toCharArray();
		int len = ch.length;
		if(len >= 7){
			for(int i = 7; i >= 4; i--){
				System.out.print(ch[len-i]);
			}
		}else{
			System.out.println("你输入的数不足7位");
		}
		
	}
	
	
}
