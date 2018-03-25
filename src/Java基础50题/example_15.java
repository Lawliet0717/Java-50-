package Java基础50题;
import java.util.*;
import java.util.Arrays;


/*
 *  Lawliet.2018.3.23
 */
/*
 * 输入三个整数x,y,z，请把这三个数由小到大输出。
 * 输入任意个整数，从小到大输出 
 */

public class example_15 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int[] arr = new int[100];
			int n;
			n = in.nextInt();
			for(int i = 0; i < n; i++){
				arr[i] = in.nextInt();
			}
			Arrays.sort(arr, 0, n);
			for(int i = 0; i < n; i++){
				System.out.print(arr[i] + " ");
			}
		}
	}
}
