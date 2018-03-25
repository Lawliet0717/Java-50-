package Java基础50题;

/*
 *  Lawliet.2018.3.25
 */
/*
 * 809*??=800*??+9*??+1
 * 其中??代表的两位数,8*??的结果为两位数，9*??的结果为3位数。求??代表的两位数，及809*??后的结果
 */
/*
 * 题目有错
 */
public class example_42 {
	
	public static void main(String[] args){
		for(int i = 10; i < 100; i++){
			int res1 = 809*i;
			int res2 = 800*i + 9*i ;
			int m = 8*i;
			int n = 9*i;
			if(m >= 10 && m <= 99){
				if(n >= 100 && n <= 999){
					if(res1 == res2){
						System.out.println(i);
						System.out.println("809*" + i + "=" + res1);
					}
				}
			}
		}
	}
}
