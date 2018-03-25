package Java基础50题;
import java.util.*;

/*
 *  Lawliet.2018.3.22
 */
/*求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，
 *几个数相加由键盘控制。 
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
