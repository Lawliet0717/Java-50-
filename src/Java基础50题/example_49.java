package Java����50��;

/*
 *  Lawliet.2018.3.25
 */
/*
 * �����ַ������Ӵ����ֵĴ��� 
 */
public class example_49 {
	
	public static int apperNum(String strText, String findText){
		int count = 0;
		int index = 0;
		while( (index = strText.indexOf(findText, index)) != -1){
			index += findText.length();
			count++;
		}
		return count;
	}
	
	public static void main(String[] args){
		String strText = "Do you like what you see";
		String findText = "you";
		int num = apperNum(strText, findText);
		System.out.println(num);
	}
}
