package Java����50��;

/*
 *  Lawliet.2018.3.25
 */
/*
 * ��0��7������ɵ�����������
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
