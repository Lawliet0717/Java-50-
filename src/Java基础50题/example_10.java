package Java����50��;
import java.util.*;

/*
 *  Lawliet.2018.3.22
 */
/*
 * һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻�����£�
 * �����ڵ�10�����ʱ�������������ף���10�η�����ߣ� 
 */

public class example_10 {
	
	public static void ball(int times){
		double curHeight = 100;
		double totalHeight = 0;
		for(int i = 0; i < times; i++){
			totalHeight += 1.5 * curHeight;
			curHeight *= 0.5;
		}
		System.out.println("���ڵĸ߶���:" + curHeight + "��");
		System.out.println("һ������" + totalHeight + "��");
	}
	
	public static void main(String[] args){
		int times;
		Scanner in = new Scanner(System.in);
		System.out.println("������С�򷴵�������");
		times = in.nextInt();
		ball(times);
	}
	
}
