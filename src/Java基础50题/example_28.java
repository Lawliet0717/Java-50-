package Java基础50题;
import java.util.Arrays;
import java.util.*;

/*
 *  Lawliet.2018.3.24
 */
/*
 * 对10个数进行排序
 */
public class example_28 {
	
	public static void bubbleSort(int arr[]){
		
		if(arr == null ||arr.length<2){
			return;
		}
		
		for(int e = arr.length-1; e > 0; e--){
			for(int i = 0; i < e; i++){
				if(arr[i] > arr[i+1] )
					swap(arr, i, i+1);
			}
		}
	}
	
	public static void swap(int arr[], int i, int j){
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
		System.out.println("请输入数组长度：");
		while(in.hasNext()){
			int len = in.nextInt();
			int[] arr = new int[len];
			System.out.println("请输入数组：");
			for(int i = 0; i < len; i++){
				arr[i] = in.nextInt();
			}
			bubbleSort(arr);
			printArray(arr);
		}
	}
}
