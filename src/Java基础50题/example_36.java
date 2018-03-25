package Java基础50题;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  Lawliet.2018.3.24
 */
/*
 * 有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数 
 */

public class example_36 {
	
	public static void changeList(int m, int n){
		ArrayList<Integer> list = new ArrayList<Integer>();
		int tmp;
		for(int i = 0; i < n; i++ ){
			list.add(i);
		}
		System.out.println("原数组为：");
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		for(int i = 0; i < m; i++){
			tmp = list.get(n-1);
			list.remove(n-1);
			list.add(0, tmp);
		}
		System.out.println("移动后的数组为：");
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i) + " ");
		}
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入数组个数和移动几位：");
		int n = in.nextInt();
		int m = in.nextInt();
		changeList(m, n);
	}
}
