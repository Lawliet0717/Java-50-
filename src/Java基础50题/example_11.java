package Java基础50题;

/*
 *  Lawliet.2018.3.23
 */
/*
 * 有1、2、3、4，这4个数字，能组成多少个  互不相同  且  无重复数字 的三位数？都是多少？ 
 */
public class example_11 {
	
	public static int calDifferent(){
		int total = 0;
		int sum = 0;
		for(int i = 1; i < 5; i++){
			for(int j = 0; j < 5; j++){
				for(int k = 0; k < 5; k++){
					if(i != j && j != k){
						sum = 100 * i + 10 * j + k;
						System.out.println(sum);
						total++;
					}
				}
			}
		}
		return total;
	}
	
	public static void main(String args[]){
		int total = 0;
		total = calDifferent();
		System.out.println("一共有" + total + "个这样的数");
		
	}

}
