package Java����50��;
import java.util.*;

/*
 *  Lawliet.2018.3.21
 */
//��һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5�� 
public class example_04 {
	public static void main(String args[]){
		int x;
		Scanner in = new Scanner(System.in);
		System.out.println("����һ��������");
		x = in.nextInt();
		new PrimeSplit(x);
	}

	public static class PrimeSplit{  
		int k = 2;
		public PrimeSplit(int x){
			if(x <= 1){
				System.out.println("��Ч��");
			}else if(x == 2){
				System.out.println("����������� =1*" + x);
			}else{
				System.out.print("����������� =1");
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
	
	
	


