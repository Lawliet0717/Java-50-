package Java基础50题;
import java.util.*;

/*
 *  Lawliet.2018.3.23
 */
/*
 * 企业发放的奖金根据利润提成。
 * 利润低于或等于10万元时，奖金可提10%；
 * 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；
 * 20万到40万之间时，高于20万元的部分，可提成5%；
 * 40万到60万之间时高于40万元的部分，可提成3%；
 * 60万到100万之间时，高于60万元的部分，可提成1.5%，
 * 高于100万元时，超过100万元的部分按1%提成，
 * 从键盘输入当月利润，求应发放奖金总数？ 
 */
public class example_12 {
	
	public static double calProfit(double profit){
		double money;
		if(profit <= 100000){
			money = profit * 0.1;
		}else if(profit <= 200000){
			money = 100000 * 0.1 + (profit - 100000) * 0.075;
		}else if(profit <= 400000){
			money = 200000 * 0.1 + (profit - 200000) * 0.05;
		}else if(profit <= 600000){
			money = 400000 * 0.1 + (profit - 400000) * 0.03;
		}else if(profit <= 1000000){
			money = 600000 * 0.1 + (profit - 600000) * 0.015;
		}else{
			money = 1000000 * 0.1 + (profit - 1000000) * 0.01;
		}
		return money;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入利润");
		double profit = in.nextDouble();
		double money = calProfit(profit);
		System.out.println("你的奖金为：" + money);
	}
	
}
