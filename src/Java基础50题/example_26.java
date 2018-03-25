package Java基础50题;
import java.util.*;

/*
 *  Lawliet.2018.3.23
 */
/*
 * 请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续判断第二个字母。
 * 
 */
public class example_26 {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char[] ch = str.toCharArray();
		switch(ch[0]){
		case 'M':{
			System.out.println("星期一");
			break;
		}
		case 'T':{
			if(ch[1] == 'u'){
				System.out.println("星期二");
			}else{
				System.out.println("星期四");
			}
			break;
		}
		case 'W':{
			System.out.println("星期三");
			break;
		}
		case 'F':{
			System.out.println("星期五");
			break;
		}
		case 'S':{
			if(ch[1] == 'a'){
				System.out.println("星期六");
			}else{
				System.out.println("星期日");
			}
			break;
		}
		}
		
		
	}
}
