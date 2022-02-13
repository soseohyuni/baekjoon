import java.util.Scanner;

public class Test1992 
{
	public static int[][] img;
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		img = new int[N][N];	
        
		for(int i=0; i<N; i++) 
		{
			String str = sc.next();
			
			for(int j=0; j<N; j++) 
			{
				img[i][j] = str.charAt(j) - '0';
			}
		}
		
		QuadTree(0, 0, N);
		
		System.out.println(sb);
		
		sc.close();
	}
	
	public static void QuadTree(int x, int y, int size)
	{
		// ������ ������ ��� �ϳ��� �������� ����
		if(isPossible(x, y, size)) 
		{
			sb.append(img[x][y]);
			return;
		}
		
		// ������ �Ұ��� �� ���
		int newSize = size / 2;
		
		sb.append('(');
		
		QuadTree(x, y, newSize);						// ���� ��
		QuadTree(x, y + newSize, newSize);				// ������ ��
		QuadTree(x + newSize, y, newSize);				// ���� �Ʒ�
		QuadTree(x + newSize, y + newSize, newSize);	// ������ �Ʒ�
		
		sb.append(')');	
	}
	
	// ������ �������� �ش� ������ üũ���ִ� �Լ�
	public static boolean isPossible(int x, int y, int size) 
	{
		int value = img[x][y];
		
		for(int i=x; i<x+size; i++) 
		{
			for(int j=y; j<y+size; j++) 
			{
				if(value != img[i][j])
					return false;
			}
		}
		return true;
	}
}
