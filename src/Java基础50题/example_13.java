package Java基础50题;

/*
 *  Lawliet.2018.3.23
 */
/*
 * 一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？ 
 */
public class example_13 {
	
	public static void calNum(){
		for(double i = 1.0 ; i < 100000; i++){
			boolean flag1 = perfect(i + 100);
			boolean flag2 = perfect(i + 168);
			if(flag1 && flag2){
				System.out.println((int) i);
			}
		}
	}
	
	public static boolean perfect(double n){
		boolean flag = true;
		int res = (int)Math.sqrt(n) * (int)Math.sqrt(n);
		if(res != n){
			flag = false;
		}
		return flag;
		
	}
	
	public static void main(String[] args){
		calNum();
	}
	
}
