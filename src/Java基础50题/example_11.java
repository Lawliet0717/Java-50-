package Java����50��;

/*
 *  Lawliet.2018.3.23
 */
/*
 * ��1��2��3��4����4�����֣�����ɶ��ٸ�  ������ͬ  ��  ���ظ����� ����λ�������Ƕ��٣� 
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
		System.out.println("һ����" + total + "����������");
		
	}

}
