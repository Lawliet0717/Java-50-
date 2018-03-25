package Java基础50题;

/*
 *  Lawliet.2018.3.23
 */
/*
 * 求1+2!+3!+...+20!的和
 */
public class example_21 {

	public static long fac(int n){
		if(n == 1 ){
			return 1;
		}
		return n * fac(n - 1);
	}
	
	public static void main(String[] args){
		long res = 0;
		for(int i = 1; i <=20; i++){
			res += fac(i);
		}
		System.out.println(res);
	}

}
