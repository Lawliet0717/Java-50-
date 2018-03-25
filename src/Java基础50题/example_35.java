package Java����50��;

import java.util.Scanner;

/*
 *  Lawliet.2018.3.24
 */
/*
 * �������飬�������һ��Ԫ�ؽ�������С�������һ��Ԫ�ؽ�����������顣
 */
public class example_35 {

	public static void swap(int[] arr, int i, int j){
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	public static void printArray(int[] arr) {
		if (arr == null) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("���������鳤�ȣ�");
		int len = in.nextInt();
		int[] arr = new int[len];
		System.out.println("���������飺");
		for(int i = 0; i < len; i++){
			arr[i] = in.nextInt();
		}
		int maxIndex = 0;
		int minIndex = 0;
		int max = arr[0];
		int min = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
				maxIndex = i;
			}
			if(arr[i] < min){
				min = arr[i];
				minIndex = i;
			}
		}
		swap(arr, 0, maxIndex);
		swap(arr, arr.length-1, minIndex);
		printArray(arr);
	}
	
}
