import java.util.Scanner;

public class Test11053 
{
	static int[] seq;
	static Integer[] dp;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		seq = new int[N];
		dp = new Integer[N];
		
		for(int i = 0; i < N; i++) 
		{
			seq[i] = sc.nextInt();
		}
		
		// 0 ~ N-1 ���� ��� �κм��� Ž�� 
		for(int i = 0; i < N; i++) 
		{
			LIS(i);
		}
		
		int max = dp[0];
		
		// �ִ� ã�� 
		for(int i = 1; i < N; i++) 
		{
			max = Math.max(max, dp[i]);
		}
		
		System.out.println(max);
		
		sc.close();
	}
	
	static int LIS(int N) 
	{
		// ���� Ž������ �ʴ� ��ġ�� ��� 
		if(dp[N] == null) 
		{
			dp[N] = 1;	// 1�� �ʱ�ȭ 
			
			// N-1 ���� 0������ N���� ���� ������ ã���鼭 ���ȣ��. 
			for(int i = N-1; i >= 0; i--) 
			{
				if(seq[i] < seq[N]) 
					dp[N] = Math.max(dp[N], LIS(i) + 1);
			}
		}
		
		return dp[N];
	}
}
