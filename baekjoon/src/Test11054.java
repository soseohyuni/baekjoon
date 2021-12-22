import java.util.Scanner;

public class Test11054 
{
	static Integer[] r_dp;
	static Integer[] l_dp;
	static int[] seq;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		 
		int N = sc.nextInt();
        
		r_dp = new Integer[N];	// LIS dp
		l_dp = new Integer[N];	// LDS dp
		seq = new int[N];
 
 
		for (int i = 0; i < N; i++) 
		{
			seq[i] = sc.nextInt();
		}
 
		for (int i = 0; i < N; i++) 
		{
			LIS(i);
			LDS(i);
		}
 
		int max = -1;
		
		for (int i = 0; i < N; i++) 
		{
			max = Math.max(r_dp[i] + l_dp[i], max);
		}
		
		System.out.println(max - 1);
		
		sc.close();
	}
 
	static int LIS(int N) 
	{
		// ���� Ž������ �ʴ� ��ġ�� ���
		if (r_dp[N] == null) 
		{
			r_dp[N] = 1; // 1�� �ʱ�ȭ
 
			// N ������ ������ Ž��
			for (int i = N-1; i >= 0; i--) 
			{
				// ������ ��� �� seq[N]�� ������ ���� �� �߰����� ���
				if (seq[i] < seq[N])
					r_dp[N] = Math.max(r_dp[N], LIS(i) + 1);
			}
		}
		
		return r_dp[N];
	}
 
	static int LDS(int N) 
	{
		// ���� Ž������ �ʴ� ��ġ�� ���
		if (l_dp[N] == null) 
		{
			l_dp[N] = 1; // 1�� �ʱ�ȭ
 
			// N ������ ������ Ž��
			for (int i = N + 1; i < l_dp.length; i++) 
			{
				// ������ ��� �� seq[N]�� ������ ���� �� �߰����� ���
				if (seq[i] < seq[N])
					l_dp[N] = Math.max(l_dp[N], LDS(i) + 1);
			}
		}
		
		return l_dp[N];
	}
}
