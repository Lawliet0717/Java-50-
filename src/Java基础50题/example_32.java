package Java����50��;

import java.util.Scanner;

/*
 *  Lawliet.2018.3.24
 */
/*
 * ȡһ������a���Ҷ˿�ʼ��4��7λ
 */
public class example_32 {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		long num = in.nextLong();
		String str = Long.toString(num);
		char[] ch = str.toCharArray();
		int len = ch.length;
		if(len >= 7){
			for(int i = 7; i >= 4; i--){
				System.out.print(ch[len-i]);
			}
		}else{
			System.out.println("�������������7λ");
		}
		
	}
	
	
}
