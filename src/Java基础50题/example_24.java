package Java����50��;
import java.util.*;

/*
 *  Lawliet.2018.3.23
 */
/*
 * ��һ��������5λ����������Ҫ��һ�������Ǽ�λ�������������ӡ����λ���֡�
 */
public class example_24 {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("������һ����������");
		String str = in.nextLine();
		System.out.println("�������" + str.length() + "λ��");
		System.out.println("������������ǣ�");
		for(int i = str.length() - 1; i >= 0; i--){
			System.out.print(str.substring(i, i+1));//substring������ҿ���
		}
	}
}
