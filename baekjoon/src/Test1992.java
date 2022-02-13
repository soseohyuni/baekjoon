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
		// 압축이 가능할 경우 하나의 색상으로 압축
		if(isPossible(x, y, size)) 
		{
			sb.append(img[x][y]);
			return;
		}
		
		// 압축이 불가능 할 경우
		int newSize = size / 2;
		
		sb.append('(');
		
		QuadTree(x, y, newSize);						// 왼쪽 위
		QuadTree(x, y + newSize, newSize);				// 오른쪽 위
		QuadTree(x + newSize, y, newSize);				// 왼쪽 아래
		QuadTree(x + newSize, y + newSize, newSize);	// 오른쪽 아래
		
		sb.append(')');	
	}
	
	// 압축이 가능한지 해당 공간을 체크해주는 함수
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
