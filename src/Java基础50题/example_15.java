package Java����50��;
import java.util.*;
import java.util.Arrays;


/*
 *  Lawliet.2018.3.23
 */
/*
 * ������������x,y,z���������������С���������
 * �����������������С������� 
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
