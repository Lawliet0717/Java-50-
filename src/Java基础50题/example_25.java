package Java����50��;
import java.util.*;

/*
 *  Lawliet.2018.3.23
 */
/*
 * һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ�� 
 */
public class example_25 {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("������һ��nλ����");
		String str = in.nextLine();
		char[] arr = str.toCharArray();
		boolean flag = true;
		int length = arr.length;
		int mid =  (int) arr.length / 2 ;
		System.out.println(mid);
		for(int i = 0; i < mid; i++){
				if(arr[i] != arr[length - 1 - i]){
					flag = false;
				}
			}
		if(flag == true){
			System.out.println("�ǻ���");
		}else{
			System.out.println("���ǻ���");
		}
	}
	
}
