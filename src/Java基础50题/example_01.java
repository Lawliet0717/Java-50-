package Java基础50题;
import java.util.*;

/*
 *  Lawliet.2018.3.21
 */
//斐波那契问题

public class example_01 {
	
	public static long fibonacci(int n){
		if(n == 0){
			return 0;
		}else if(n == 1){
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2) ;
	}
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("请输入年份：");
		int n = in.nextInt();
		long res = fibonacci(n);
		System.out.println("现在已经有" + res + "只兔子拉！");
	}

}
