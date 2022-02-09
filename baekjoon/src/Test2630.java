import java.util.Scanner;

public class Test2630 
{
	// ���� ī��Ʈ �� ���� �� ������
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
		
		int newSize = size/2;	// ���� ������
		
		// ��� ȣ��
		partition(row, col, newSize);						// 2��и�
		partition(row, col + newSize, newSize);				// 1��и�
		partition(row + newSize, col, newSize);				// 3��и�
		partition(row + newSize, col + newSize, newSize);	// 4��и�
	}
	
	
	// ���� ��Ƽ���� �÷��� ������ üũ
	public static boolean colorCheck(int row, int col, int size) 
	{
		// ù ��° ���Ҹ� �������� �˻�
		int color = board[row][col];
		
		for(int i=row; i<row+size; i++) 
		{
			for(int j=col; j<col+size; j++) 
			{
				// ������ ���� �ʴٸ� false�� ���� 
				if(board[i][j] != color)
					return false;
			}
		}
		
		// �˻縦 ��� ��������� true ����
		return true;
	}
}