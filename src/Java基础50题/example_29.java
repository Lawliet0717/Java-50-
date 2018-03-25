package Java基础50题;
import java.util.*;

/*
 *  Lawliet.2018.3.24
 */
/*
 * 求一个3*3矩阵对角线元素之和 
 */
public class example_29 {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入数组的行数和列数：");
		int m = in.nextInt();
		int n = in.nextInt();
		int[][] arr = new int[m][n];
		System.out.println("请输入数组");
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				arr[i][j] = in.nextInt();
			}
		}
		int sum = 0;
		for(int i = 0; i < m; i++){
			sum += arr[i][i];
		}
		System.out.println("对角线之和为：" + sum);
	}

}
