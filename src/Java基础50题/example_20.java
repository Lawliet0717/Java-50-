package Java����50��;

/*
 *  Lawliet.2018.3.23
 */
/*
 * ��һ�������У�2/1��3/2��5/3��8/5��13/8��21/13...���������е�ǰ20��֮�͡� 
 */

public class example_20 {
	
	public static void calSum(){
		double sum = 0;
		double n1 = 1;
		double n2 = 2;
		double tmp;
		for(int i = 0; i < 20; i++){
			sum = sum + n2/n1;
			tmp = n2;
			n2 = n1 + n2;
			n1 = tmp;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args){
		calSum();
	}
	
}
