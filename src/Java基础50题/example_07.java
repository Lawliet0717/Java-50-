package Java基础50题;
import java.util.*;

/*
 *  Lawliet.2018.3.22
 */
//输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
public class example_07 {
	public static void main(String[] args){
		int letterNum = 0;
		int spaceNum = 0;
		int digitNum = 0;
		int otherNum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一段字符串");
		String str;
		str = in.nextLine();
		char[] ch = str.toCharArray();
		for(int i = 0; i < ch.length; i++){
			if(Character.isLetter(ch[i])){
				letterNum++;
			}else if(Character.isSpaceChar(ch[i])){
				spaceNum++;
			}else if(Character.isDigit(ch[i])){
				digitNum++;
			}else{
				otherNum++;
			}
		}
		System.out.println("字母个数为：" + letterNum);
		System.out.println("空格个数为：" + spaceNum);
		System.out.println("字符个数为：" + digitNum);
		System.out.println("其他个数为：" + otherNum);
	}
}
