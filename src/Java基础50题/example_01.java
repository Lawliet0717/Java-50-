package Java����50��;
import java.util.*;

/*
 *  Lawliet.2018.3.21
 */
//쳲���������

public class example_01 {
	
	public static long fibonacci(int n){
		if(n == 0){
			return 0;
		}else if(n == 1){
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2) ;
	}
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("��������ݣ�");
		int n = in.nextInt();
		long res = fibonacci(n);
		System.out.println("�����Ѿ���" + res + "ֻ��������");
	}

}
