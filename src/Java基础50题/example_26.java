package Java����50��;
import java.util.*;

/*
 *  Lawliet.2018.3.23
 */
/*
 * ���������ڼ��ĵ�һ����ĸ���ж�һ�������ڼ��������һ����ĸһ����������жϵڶ�����ĸ��
 * 
 */
public class example_26 {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char[] ch = str.toCharArray();
		switch(ch[0]){
		case 'M':{
			System.out.println("����һ");
			break;
		}
		case 'T':{
			if(ch[1] == 'u'){
				System.out.println("���ڶ�");
			}else{
				System.out.println("������");
			}
			break;
		}
		case 'W':{
			System.out.println("������");
			break;
		}
		case 'F':{
			System.out.println("������");
			break;
		}
		case 'S':{
			if(ch[1] == 'a'){
				System.out.println("������");
			}else{
				System.out.println("������");
			}
			break;
		}
		}
		
		
	}
}
