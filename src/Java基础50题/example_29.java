package Java����50��;
import java.util.*;

/*
 *  Lawliet.2018.3.24
 */
/*
 * ��һ��3*3����Խ���Ԫ��֮�� 
 */
public class example_29 {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("�����������������������");
		int m = in.nextInt();
		int n = in.nextInt();
		int[][] arr = new int[m][n];
		System.out.println("����������");
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				arr[i][j] = in.nextInt();
			}
		}
		int sum = 0;
		for(int i = 0; i < m; i++){
			sum += arr[i][i];
		}
		System.out.println("�Խ���֮��Ϊ��" + sum);
	}

}
