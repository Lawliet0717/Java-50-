package Java基础50题;
import java.util.*;

/*
 *  Lawliet.2018.3.23
 */
/*
 * 一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。 
 */
public class example_25 {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个n位数：");
		String str = in.nextLine();
		char[] arr = str.toCharArray();
		boolean flag = true;
		int length = arr.length;
		int mid =  (int) arr.length / 2 ;
		System.out.println(mid);
		for(int i = 0; i < mid; i++){
				if(arr[i] != arr[length - 1 - i]){
					flag = false;
				}
			}
		if(flag == true){
			System.out.println("是回文");
		}else{
			System.out.println("不是回文");
		}
	}
	
}
