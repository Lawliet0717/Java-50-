package Java����50��;

import java.util.Scanner;

/*
 *  Lawliet.2018.3.24
 */
/*
 * ��дһ������������nΪż��ʱ�����ú�����1/2+1/4+...+1/n,
 * ������nΪ����ʱ�����ú����� 1/1+1/3+...+1/n
 */
public class example_39 {
	
	public static void fun(int n){
		double sum = 0;
		if(n % 2 == 0){
			for(int i = 2; i <= n; i += 2){
				sum += (double) 1/i ;
			}
		}else{
			for(int i = 1; i <= n; i += 2){
				sum += (double) 1/i ;
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		fun(n);
	}
}
