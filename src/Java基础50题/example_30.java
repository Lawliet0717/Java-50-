package Java����50��;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



/*
 *  Lawliet.2018.3.24
 */
/*
 * ��һ���Ѿ��ź�������顣������һ������Ҫ��ԭ���Ĺ��ɽ������������С� 
 */
public class example_30 {
	public static void main(String[] args){
		int[] martx ={1,2,5,8,10};
		ArrayList list = new ArrayList();
		for(int i = 0; i < martx.length; i++){
			list.add(martx[i]);
		}
		
		System.out.print("��ǰ����Ϊ��");
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i) + " ");
		}
		/*Collections.reverse(list);
		System.out.print("��ǰ����Ϊ��");
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i) + " ");
		}*/
		System.out.println();
		System.out.print("��������ӵ�����");
		Scanner in = new Scanner(System.in);
		int element = in.nextInt();
		list.add(element);
		Collections.sort(list);
		
		/*System.out.print("����֮������Ϊ��");
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
