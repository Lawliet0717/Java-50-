package Java����50��;

/*
 *  Lawliet.2018.3.24
 */
/*
 * ��100֮�ڵ�����
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
		System.out.println("100����һ���� " + num + "������" );
	}

}
