package Java基础50题;

/*
 *  Lawliet.2018.3.23
 */
/*
 * 有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。
 * 问第4个人岁数，他说比第3个人大2岁。
 * 问第三个人，又说比第2人大两岁。
 * 问第2个人，说比第一个人大两岁。
 * 最后问第一个人，他说是10岁。请问第五个人多大？ 
 */
public class example_23 {
	
	public static int fun(int n){
		if(n == 1){
			return 10;
		}
		return 2 + fun(n - 1);
	}
	
	public static void main(String[] args){
		int n = 5;
		int res = fun(n);
		System.out.println(res);
	}
	
}
