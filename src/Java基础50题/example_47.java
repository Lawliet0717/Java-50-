package Java基础50题;

import java.util.Scanner;

/*
 *  Lawliet.2018.3.25
 */
/*
 * 读取7个数（1—50）的整数值，每读取一个值，程序打印出该值.
 */
public class example_47 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] arr = new int[7];
		for(int i = 0; i < 7; i++){
			arr[i] = in.nextInt();
			System.out.println(arr[i]);
		}
	}
}
