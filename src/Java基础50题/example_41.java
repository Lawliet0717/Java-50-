package Java����50��;

import java.util.Scanner;

/*
 *  Lawliet.2018.3.25
 */
/*
 * ��̲����һ�����ӣ���ֻ�������֡���һֻ���Ӱ��������ƽ����Ϊ��ݣ�����һ������ֻ���ӰѶ��һ
�����뺣�У�������һ�ݡ��ڶ�ֻ���Ӱ�ʣ�µ�������ƽ���ֳ���ݣ��ֶ���һ������ͬ���Ѷ��һ�����뺣��
��������һ�ݣ����������ġ�����ֻ���Ӷ����������ģ��ʺ�̲��ԭ�������ж��ٸ����ӣ� 
 */

public class example_41 {
	
	public static void funPeach(int num){
		for(int i = 0; i < 5; i++){
			num = 5 * num + 1;
		}
		System.out.println("��̲��ԭ����" + num + "������");
	}
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.println("�������5ֻ�������˶��ٸ����ӣ�");
		int start = in.nextInt();
		funPeach(start);
	}
	
}
