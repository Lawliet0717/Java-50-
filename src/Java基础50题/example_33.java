package Java基础50题;

/*
 *  Lawliet.2018.3.24
 */
/*
 * 打印出杨辉三角形
 */
public class example_33 {
	
	public static void main(String[] args){
		int[][] tri = new int[8][];
		for(int i = 0; i < tri.length; i++){
			tri[i] = new int[i + 1];
			for(int j = 0; j < tri[i].length; j++ ){
				if(i == 0 || j == 0 || j == tri[i].length-1){
					tri[i][j] = 1;
				}else{
					tri[i][j] = tri[i-1][j] + tri[i-1][j-1];
				}
				System.out.print(tri[i][j] + " ");
			}
			System.out.println();
		}
	}

}
