package Java����50��;

/*
 *  Lawliet.2018.3.23
 */
/*
 * ��5��������һ���ʵ�����˶����ꣿ��˵�ȵ�4���˴�2�ꡣ
 * �ʵ�4������������˵�ȵ�3���˴�2�ꡣ
 * �ʵ������ˣ���˵�ȵ�2�˴����ꡣ
 * �ʵ�2���ˣ�˵�ȵ�һ���˴����ꡣ
 * ����ʵ�һ���ˣ���˵��10�ꡣ���ʵ�����˶�� 
 */
public class example_23 {
	
	public static int fun(int n){
		if(n == 1){
			return 10;
		}
		return 2 + fun(n - 1);
	}
	
	public static void main(String[] args){
		int n = 5;
		int res = fun(n);
		System.out.println(res);
	}
	
}
