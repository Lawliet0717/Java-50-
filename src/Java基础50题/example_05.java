package Java����50��;
import java.util.*;

/*
 *  Lawliet.2018.3.21
 */
//���������������Ƕ������ɴ��⣺ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ�� 
public class example_05 {
	public static void judgeScore(int x){
		char grade = 'A';
		grade = x >= 90 ? 'A' : (x < 60 ? 'C' : 'B');
		System.out.println("��ĵȼ��ǣ�" + grade);
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("��������ĳɼ���");
		int x;
		x = in.nextInt();
		judgeScore(x);
	}
}
