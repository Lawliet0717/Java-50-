package Java����50��;

/*
 *  Lawliet.2018.3.21
 */
/*
 * ��ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ����������磺
 * 153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5�����η���3�����η���
 */

public class example_03 {
	public static void main(String args[]){
		int x,y,z;//�ֱ�����λ���֣�ʮλ���֣���λ����
		double sum;
		for(int i = 100; i <= 999; i++){
			z = i % 10;//��λ������10ȡ��
			y = (i / 10) % 10;//ʮλ������10֮���ٳ�10ȡ��
			x = i / 100;//��λ������100ȡ��
			sum = Math.pow(x, 3) + Math.pow(y, 3) + Math.pow(z, 3);
			if(sum == i){
				System.out.println(i);
			}
		}
	}
}
