package Java����50��;

import java.util.ArrayList;
import java.util.Collections;

/*
 *  Lawliet.2018.3.24
 */
/*
 * ���������
 */
public class example_31 {
	
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
		
		Collections.reverse(list);
		System.out.print("���������Ϊ��");
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i) + " ");
		}
	}
}
