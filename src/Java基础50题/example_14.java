package Java基础50题;
import java.util.*;

/*
 *  Lawliet.2018.3.23
 */
/*
 * 输入某年某月某日，判断这一天是这一年的第几天？
 */
public class example_14 {

	public static int calDays(int year, int month, int day){
		int days = 0;
		int total = 0;
		for(int i = 1; i < month; i++){
			switch(i){
			case 1:{
				days = 31;
				break;
			}
			case 2:{
				if(year % 4 == 0){
					days = 29;
				}else{
					days = 28;
				}
				break;
			}
			case 3:{
				days = 31;
				break;
			}
			case 4:{
				days = 30;
				break;
			}
			case 5:{
				days = 31;
				break;
			}
			case 6:{
				days = 30;
				break;
			}
			case 7:{
				days = 31;
				break;
			}
			case 8:{
				days = 31;
				break;
			}
			case 9:{
				days = 30;
				break;
			}
			case 10:{
				days = 31;
				break;
			}
			case 11:{
				days = 31;
				break;
			}
			}
			total += days;
		}
		total += day; 
		return total;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入 某年某月某日");
		int year = in.nextInt();
		int month = in.nextInt();
		int day = in.nextInt();
		int total = calDays(year, month, day);
		System.out.println("这是第" + total + "天");
	}
}
