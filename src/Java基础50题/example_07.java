package Java����50��;
import java.util.*;

/*
 *  Lawliet.2018.3.22
 */
//����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����
public class example_07 {
	public static void main(String[] args){
		int letterNum = 0;
		int spaceNum = 0;
		int digitNum = 0;
		int otherNum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("������һ���ַ���");
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
		System.out.println("��ĸ����Ϊ��" + letterNum);
		System.out.println("�ո����Ϊ��" + spaceNum);
		System.out.println("�ַ�����Ϊ��" + digitNum);
		System.out.println("��������Ϊ��" + otherNum);
	}
}
