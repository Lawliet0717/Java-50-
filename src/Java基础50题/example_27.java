package Java基础50题;

/*
 *  Lawliet.2018.3.24
 */
/*
 * 求100之内的素数
 */
public class example_27 {
	
	public static void main(String args[]){
		int factor = 0;
		int num = 0;
		for(int i = 1; i <= 100; i++){
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
		System.out.println("100以内一共有 " + num + "个素数" );
	}

}
