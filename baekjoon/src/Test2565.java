import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Test2565 
{
	static Integer[] dp;
	static int[][] wire;
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		dp = new Integer[N];
		wire = new int[N][2];
		
		for(int i=0; i<N; i++) 
		{
			wire[i][0] = sc.nextInt();
			wire[i][1] = sc.nextInt();
		}
		
		// ù ��° ����(A������)�� �������� ������������ ��
		Arrays.sort(wire, new Comparator<int[]>() 
		{
			public int compare(int[] o1, int[] o2) 
			{
				return o1[0] - o2[0];
			}
		});
 
		int max = 0;
		
		/*
		 *  i��° A������ �������� ���ᰡ���� ���� Ž��
		 *  �� �ִ� ã��
		 */
		 
		for(int i=0; i<N; i++) 
		{
			max = Math.max(recur(i), max);
		}
		
		// ���� ���� - ���� 
		System.out.println(N - max);
		
		sc.close();
	}
	
	
	static int recur(int N) 
	{
		// Ž������ �ʾҴ� ��ġ��� 
		if(dp[N] == null) 
		{
			dp[N] = 1;	// �ּڰ� 1�� �ʱ�ȭ 
			
			// A�� N��°�� ������ ������� �� 
			for(int i=N+1; i<dp.length; i++) 
			{
				/*
				 *  A�������� N��° ������ ����Ǿ��ִ� B�����뺸�� A�� i��°
				 *  �������� ������ �̾��� B�����밡 �ڿ� ���� ��� 
				 *  ������ ��ġ�� �� ���� 
				 */
				if(wire[N][1] < wire[i][1]) 
				{
					// ���� ������ ������ ����� �� �� ū ���� dp�� �����Ѵ�.
					dp[N] = Math.max(dp[N], recur(i) + 1);
				}
			}
		}
		
		return dp[N];
	}
}
