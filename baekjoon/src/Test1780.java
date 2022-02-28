import java.util.Scanner;

public class Test1780 
{
	public static int[][] board;
	public static int GRAY = 0;		// -1�� �ش�
	public static int WHITE = 0;	// 0�� �ش�
	public static int BLACK = 0;	// 1�� �ش�
 
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
 
		System.out.println(GRAY);	// -1
		System.out.println(WHITE);	// 0
		System.out.println(BLACK);	// 1
		
		sc.close();
	}
	
	public static void partition(int row, int col, int size)
	{
		// ���� ���� �������� �̷�����ִٸ� �ش� ���� ī��Ʈ�� ����
		if(colorCheck(row, col, size)) 
		{
			if(board[row][col] == -1) 
				GRAY++;
			else if(board[row][col] == 0)
				WHITE++;
			else
				BLACK++;
 
			return;
		}
 
		int newSize = size / 3;
		
		partition(row, col, newSize);								// ���� ��
		partition(row, col + newSize, newSize);						// �߾� ��
		partition(row, col + 2 * newSize, newSize);					// ������ ��
		
		partition(row + newSize, col, newSize);						// ���� �߰�
		partition(row + newSize, col + newSize, newSize);			// �߾� �߰�
		partition(row + newSize, col + 2 * newSize, newSize);		// ������ �߰�
		
		partition(row + 2 * newSize, col, newSize);					// ���� �Ʒ�
		partition(row + 2 * newSize, col + newSize, newSize);		// �߾� �Ʒ�
		partition(row + 2 * newSize, col + 2 * newSize, newSize);	// ������ �Ʒ�
 
	}
 
	// �ش� ������ ���� ������ �˻�
	public static boolean colorCheck(int row, int col, int size) 
	{
		int color = board[row][col];
 
		// �� ���� ���ۺ��� ������ �˻�
		for(int i=row; i<row+size; i++) 
		{
			for(int j=col; j<col+size; j++) 
			{
				if (color != board[i][j]) 
					return false;
			}
		}
		
		return true;
	}
}