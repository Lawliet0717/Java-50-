package Java����50��;

import java.util.Scanner;

/*
 *  Lawliet.2018.3.25
 */
/*
 * ֤��һ��ż�����ܱ�ʾΪ��������֮��
 */
public class example_44 {
	public static boolean prime(int n){
		boolean flag = true;
		for(int i = 2; i < n; i++){
			if(n % i == 0){
				flag = false;
			}
			break;
		}
		return flag;
	}
	
	public static void splitTwoPrime(int n){
		for(int i = 2; i < n/2; i++){
			if( prime(i) && prime(n - i) ){
				System.out.println(n + "=" + i + "+" + (n - i) );
			}
		}
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("������һ��ż����");
		int n = in.nextInt();
		if(n % 2 != 0){
			System.out.println("������Ĳ���ż��");
		}else{
			splitTwoPrime(n);
		}
	}

}
