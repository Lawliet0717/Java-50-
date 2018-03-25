package Java基础50题;

/*
 *  Lawliet.2018.3.21
 */
//判断101-200之间有多少个素数
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
		System.out.println("101-200之间一共有 " + num + " 个素数" );
	}
} 
   
	
	
	
	
	
