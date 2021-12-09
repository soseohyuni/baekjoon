import java.util.Scanner;

public class Test9184 
{	
	/*
	 * �Լ� w���� a, b, c �� 20�� �Ѿ�� �Ǹ� w(20, 20, 20)�� ȣ���ϰ�,
	 * 0 ������ ���� 1�� ��ȯ�ϱ� ������
	 * �� �迭�� ũ�Ⱑ 21 (0~20)�� �ѱ��� �ʴ´�.
	 */
	static int[][][] arr = new int[21][21][21];
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a=0;
		int b=0;
		int c=0;
		
		while(true)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if(a==-1 && b==-1 && c==-1)
				break;
			
			System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, w(a, b, c));
		};
		
		sc.close();
	}
	
	static int w(int a, int b, int c)
	{
		if(inRange(a, b, c) && arr[a][b][c]!=0)
			return arr[a][b][c];
		
		if(a<=0 || b<=0 || c<=0)
			return 1;
		if(a>20 || b>20 || c>20)
			return arr[20][20][20] = w(20, 20, 20);
		if(a<b && b<c)
			return arr[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
		
		return arr[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
	}
	
	/*
	 *  �迭�� �����Ϸ� �� �� a, b, c �� �ϳ��� ���� ���� ����
	 *  ���� �� �ֱ� ������ �̸� üũ�� ���ֱ� ���� �Լ���.
	 */
	static boolean inRange(int a, int b, int c) {
		return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20; 
	}
}
