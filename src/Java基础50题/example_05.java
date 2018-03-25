package Java基础50题;
import java.util.*;

/*
 *  Lawliet.2018.3.21
 */
//利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。 
public class example_05 {
	public static void judgeScore(int x){
		char grade = 'A';
		grade = x >= 90 ? 'A' : (x < 60 ? 'C' : 'B');
		System.out.println("你的等级是：" + grade);
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入你的成绩：");
		int x;
		x = in.nextInt();
		judgeScore(x);
	}
}
