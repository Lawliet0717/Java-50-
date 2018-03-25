package Java基础50题;

import java.util.ArrayList;
import java.util.Collections;

/*
 *  Lawliet.2018.3.24
 */
/*
 * 数组的逆序
 */
public class example_31 {
	
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
		
		Collections.reverse(list);
		System.out.print("逆序后数组为：");
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i) + " ");
		}
	}
}
