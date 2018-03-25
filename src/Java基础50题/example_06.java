package Java基础50题;
import java.util.*;

/*
 *  Lawliet.2018.3.22
 */
//输入两个正整数m和n，求其最大公约数和最小公倍数
public class example_06 {
	public static class gcdlcm{
		public int gcd(int m, int n){
			if(m < n){
				int tmp = m;
				m = n;
				n = tmp;
			}
			if(m % n == 0){
				return n;
			}else{
				m %= n;
				return gcd(m , n);
			}
		}
		public int lcm(int m, int n){
			if(m < n){
				int tmp = m;
				m = n;
				n = tmp;
			}
			int res = m;
			int i = 2;
			while(res % n != 0){
				res = m * i;
			}
			return res;
		}
	}
	public static void main(String args[]){
		int m = 20;
		int n = 5;
		gcdlcm res = new gcdlcm();
		System.out.println(res.gcd(m, n));
		System.out.println(res.lcm(m, n));
	}
}
