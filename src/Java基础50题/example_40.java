package Java»ù´¡50Ìâ;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  Lawliet.2018.3.24
 */
/*
 * ×Ö·û´®ÅÅÐò¡£
 */
public class example_40 {
	
	public static void printArray(char[] arr) {
		if (arr == null) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		String str;
		Scanner in = new Scanner(System.in);
		str = in.nextLine();
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		printArray(ch);
	}
}
