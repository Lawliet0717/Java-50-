package Java����50��;
import java.util.*;

/*
 *  Lawliet.2018.3.23
 */
/*
 * ���ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬�ֶ����һ�� 
 * �ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ����
 * �Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ����
 * ����10���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶��١� 
 */
public class example_17 {
	
	public static int monkeyEatPeach(int days){
		int last = 1;
		for(int i = 1; i < days; i++){
			last = (last + 1) * 2;
		}
		return last;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("����������");
		int days = in.nextInt();
		int res = monkeyEatPeach(days);
		System.out.println("��һ��ʱһ����" + res + "������");
	}
		
}
