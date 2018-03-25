package Java基础50题;
import java.util.*;

/*
 *  Lawliet.2018.3.25
 */
/*
 * 两个字符串连接
 */
public class example_46 {
	
	public static void main(String[] args){
		StringBuffer sb1 = new StringBuffer("ab");
		StringBuffer sb2 = new StringBuffer("cd");
		sb1.append(sb2);
		System.out.println(sb1);
	}
}
