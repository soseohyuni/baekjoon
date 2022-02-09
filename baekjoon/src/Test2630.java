import java.util.Scanner;

public class Test2630 
{
	// 색상 카운트 할 변수 및 색종이
	public static int white = 0;
	public static int blue = 0;
	public static int[][] board;
 
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		board = new int[N][N];
		
		for(int i=0; i<N; i++) 
		{
			for(int j=0; j<N; j++) 
			{
				board[i][j] = sc.nextInt();
			}
		}
		
		partition(0, 0, N);
		
		System.out.println(white);
		System.out.println(blue);
		
		sc.close();
	}
	
	public static void partition(int row, int col, int size) 
	{
		if(colorCheck(row, col, size)) 
		{
			if(board[row][col] == 0)
				white++;
			else
				blue++;
			
			return;
		}
		
		int newSize = size/2;	// 절반 사이즈
		
		// 재귀 호출
		partition(row, col, newSize);						// 2사분면
		partition(row, col + newSize, newSize);				// 1사분면
		partition(row + newSize, col, newSize);				// 3사분면
		partition(row + newSize, col + newSize, newSize);	// 4사분면
	}
	
	
	// 현재 파티션의 컬러가 같은지 체크
	public static boolean colorCheck(int row, int col, int size) 
	{
		// 첫 번째 원소를 기준으로 검사
		int color = board[row][col];
		
		for(int i=row; i<row+size; i++) 
		{
			for(int j=col; j<col+size; j++) 
			{
				// 색상이 같이 않다면 false를 리턴 
				if(board[i][j] != color)
					return false;
			}
		}
		
		// 검사를 모두 통과했으면 true 리턴
		return true;
	}
}