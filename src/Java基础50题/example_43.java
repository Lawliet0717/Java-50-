package Java基础50题;

/*
 *  Lawliet.2018.3.25
 */
/*
 * 求0—7所能组成的奇数个数。
 */
public class example_43 {
	public static void main(String[] args){
		int total = 4;
		int x = 4;
		for(int i = 2; i <= 8; i++){
			if(i == 2){
				x *= 7;
			}else{
				x *= 8;
			}
			total += x;
		}
		System.out.println(total);
	}
}
