package Java����50��;

/*
 *  Lawliet.2018.3.21
 */
//�ж�101-200֮���ж��ٸ�����
public class example_02 {
	public static void main(String args[]){
		int factor = 0;
		int num = 0;
		for(int i = 101; i <= 200; i++){
			for(int j = 1; j <= i; j++){
				if(i % j == 0){
					factor++;
				}
			}
			if(factor == 2){
				num++;
				System.out.print(i + " ");
			}
			factor = 0;
		}
		System.out.println();
		System.out.println("101-200֮��һ���� " + num + " ������" );
	}
} 
   
	
	
	
	
	
