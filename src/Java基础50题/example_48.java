package Java����50��;
import java.util.Scanner;

/*
 *  Lawliet.2018.3.25
 */
/*
 * ĳ����˾���ù��õ绰�������ݣ���������λ���������ڴ��ݹ������Ǽ��ܵģ�
 * ���ܹ������£�ÿλ���ֶ�����5,Ȼ���úͳ���10��������������֣��ٽ���һλ�͵���λ�������ڶ�λ�͵���λ������ 
 */

public class example_48 {
	
	public static void main(String[] args){
		int[] arr = new int[100];
		System.out.println("������һ��4λ����");// n1n2n3n4
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int n1 = n / 1000;
		int n2 = (n % 1000) / 100;
		int n3 = (n % 1000) % 100 / 10;
		int n4 = (n % 1000) % 100 % 10;
		arr[0] = n1;
		arr[1] = n2;
		arr[2] = n3;
		arr[3] = n4;
		for(int i = 0; i < 4; i++){
			if(arr[i] >= 5){
				arr[i] = ( arr[i] + 5 ) % 10;
			}else{
				arr[i] = arr[i] + 5;
			}
		}
		System.out.println("���ܺ��4λ����");
		for(int i = 0; i < 4; i++){
			System.out.print(arr[i]);
		}
	}
}
