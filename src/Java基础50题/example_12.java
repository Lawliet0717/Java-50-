package Java����50��;
import java.util.*;

/*
 *  Lawliet.2018.3.23
 */
/*
 * ��ҵ���ŵĽ������������ɡ�
 * ������ڻ����10��Ԫʱ���������10%��
 * �������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣������7.5%��
 * 20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%��
 * 40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��
 * 60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%��
 * ����100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ�
 * �Ӽ������뵱��������Ӧ���Ž��������� 
 */
public class example_12 {
	
	public static double calProfit(double profit){
		double money;
		if(profit <= 100000){
			money = profit * 0.1;
		}else if(profit <= 200000){
			money = 100000 * 0.1 + (profit - 100000) * 0.075;
		}else if(profit <= 400000){
			money = 200000 * 0.1 + (profit - 200000) * 0.05;
		}else if(profit <= 600000){
			money = 400000 * 0.1 + (profit - 400000) * 0.03;
		}else if(profit <= 1000000){
			money = 600000 * 0.1 + (profit - 600000) * 0.015;
		}else{
			money = 1000000 * 0.1 + (profit - 1000000) * 0.01;
		}
		return money;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("����������");
		double profit = in.nextDouble();
		double money = calProfit(profit);
		System.out.println("��Ľ���Ϊ��" + money);
	}
	
}
