package Java基础50题;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



/*
 *  Lawliet.2018.3.24
 */
/*
 * 有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。 
 */
public class example_30 {
	public static void main(String[] args){
		int[] martx ={1,2,5,8,10};
		ArrayList list = new ArrayList();
		for(int i = 0; i < martx.length; i++){
			list.add(martx[i]);
		}
		
		System.out.print("当前数组为：");
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i) + " ");
		}
		/*Collections.reverse(list);
		System.out.print("当前数组为：");
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i) + " ");
		}*/
		System.out.println();
		System.out.print("请输入添加的数：");
		Scanner in = new Scanner(System.in);
		int element = in.nextInt();
		list.add(element);
		Collections.sort(list);
		
		/*System.out.print("排序之后数组为：");
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i) + " ");
		}*/
		
		Integer[] arr = new Integer[list.size()];
		list.toArray(arr);
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
		
	}
}
