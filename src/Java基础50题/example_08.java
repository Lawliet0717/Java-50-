package Java����50��;
import java.util.*;

/*
 *  Lawliet.2018.3.22
 */
/*��s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�����2+22+222+2222+22222(��ʱ����5�������)��
 *����������ɼ��̿��ơ� 
 */
public class example_08 {
	public static void main(String[] args){
		int res;
		res = calculate(2, 5);
		System.out.println(res);
	}
	public static int calculate(int base, int totalTime){
		int res = 0;
		int time = 0;
		int nowdate = 0;
		int lastdate = 0;
		while(time < totalTime){
			nowdate = (int) (base * Math.pow(10, time++) + lastdate);
			res += nowdate;
			if(time == totalTime ){
				System.out.print(nowdate + "=");
			}else{
				System.out.print(nowdate + "+");
			}
			lastdate = nowdate;
		}
		return res;
	}
}
