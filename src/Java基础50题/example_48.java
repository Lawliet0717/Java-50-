package Java基础50题;
import java.util.Scanner;

/*
 *  Lawliet.2018.3.25
 */
/*
 * 某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，
 * 加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。 
 */

public class example_48 {
	
	public static void main(String[] args){
		int[] arr = new int[100];
		System.out.println("请输入一个4位整数");// n1n2n3n4
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int n1 = n / 1000;
		int n2 = (n % 1000) / 100;
		int n3 = (n % 1000) % 100 / 10;
		int n4 = (n % 1000) % 100 % 10;
		arr[0] = n1;
		arr[1] = n2;
		arr[2] = n3;
		arr[3] = n4;
		for(int i = 0; i < 4; i++){
			if(arr[i] >= 5){
				arr[i] = ( arr[i] + 5 ) % 10;
			}else{
				arr[i] = arr[i] + 5;
			}
		}
		System.out.println("加密后的4位数是");
		for(int i = 0; i < 4; i++){
			System.out.print(arr[i]);
		}
	}
}
