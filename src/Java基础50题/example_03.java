package Java基础50题;

/*
 *  Lawliet.2018.3.21
 */
/*
 * 打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：
 * 153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
 */

public class example_03 {
	public static void main(String args[]){
		int x,y,z;//分别代表百位数字，十位数字，个位数字
		double sum;
		for(int i = 100; i <= 999; i++){
			z = i % 10;//个位数：除10取余
			y = (i / 10) % 10;//十位数：除10之后，再除10取余
			x = i / 100;//百位数：除100取余
			sum = Math.pow(x, 3) + Math.pow(y, 3) + Math.pow(z, 3);
			if(sum == i){
				System.out.println(i);
			}
		}
	}
}
