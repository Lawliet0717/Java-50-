package Java����50��;

/*
 *  Lawliet.2018.3.23
 */
//���9*9�ھ�
public class example_16 {
	
	public static void printMulTables(){
		int res;
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= i; j++){
				res = i * j;
				System.out.print(i + "*" + j + "=" + res + " " );
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		printMulTables();
	}
}
