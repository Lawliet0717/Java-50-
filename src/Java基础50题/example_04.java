package Java基础50题;
import java.util.*;

/*
 *  Lawliet.2018.3.21
 */
//将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。 
public class example_04 {
	public static void main(String args[]){
		int x;
		Scanner in = new Scanner(System.in);
		System.out.println("输入一个正整数");
		x = in.nextInt();
		new PrimeSplit(x);
	}

	public static class PrimeSplit{  
		int k = 2;
		public PrimeSplit(int x){
			if(x <= 1){
				System.out.println("无效！");
			}else if(x == 2){
				System.out.println("输入的正整数 =1*" + x);
			}else{
				System.out.print("输入的正整数 =1");
				while(k <= x){
					if(x % k == 0){
						System.out.print("*" + k);
						x = x/k;
					}else{
						k++;
					}
				}
			}
		}
	}
}   
	
	
	


