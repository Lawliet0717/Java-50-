package Java����50��;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  Lawliet.2018.3.24
 */
/*
 * ��n��������ʹ��ǰ�����˳�������m��λ�ã����m���������ǰ���m���� 
 */

public class example_36 {
	
	public static void changeList(int m, int n){
		ArrayList<Integer> list = new ArrayList<Integer>();
		int tmp;
		for(int i = 0; i < n; i++ ){
			list.add(i);
		}
		System.out.println("ԭ����Ϊ��");
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		for(int i = 0; i < m; i++){
			tmp = list.get(n-1);
			list.remove(n-1);
			list.add(0, tmp);
		}
		System.out.println("�ƶ��������Ϊ��");
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i) + " ");
		}
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("����������������ƶ���λ��");
		int n = in.nextInt();
		int m = in.nextInt();
		changeList(m, n);
	}
}
