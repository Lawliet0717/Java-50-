package Java基础50题;

import java.util.Scanner;

/*
 *  Lawliet.2018.3.25
 */
/*
 * 海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子平均分为五份，多了一个，这只猴子把多的一
个扔入海中，拿走了一份。第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中
，拿走了一份，第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？ 
 */

public class example_41 {
	
	public static void funPeach(int num){
		for(int i = 0; i < 5; i++){
			num = 5 * num + 1;
		}
		System.out.println("海滩上原来有" + num + "个桃子");
	}
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.println("请输入第5只猴子拿了多少个桃子：");
		int start = in.nextInt();
		funPeach(start);
	}
	
}
