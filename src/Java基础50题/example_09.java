package Java����50��;

/*
 *  Lawliet.2018.3.22
 */
//һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ"����"������6=1��2��3.��� �ҳ�1000���ڵ�����������

public class example_09 {
	public static void main(String[] args){
		for(int i = 2; i < 1000; i++){
			int sum = 0;
			for(int j = 1; j < i; j++){
				if(i % j == 0){
					sum = sum + j;
				}
			}
			if(sum == i){
				System.out.println(i);
			}
		}
	}
}
