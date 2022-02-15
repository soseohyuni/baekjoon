import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// ���� ����ȭ ����
public class Test12865 
{
	static Integer[][] dp;
	static int[] W; 		// weight
	static int[] V; 		// value
 
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
 
		W = new int[N];
		V = new int[N];
 
		dp = new Integer[N][K + 1];
 
		for (int i=0; i<N; i++) 
		{
			st = new StringTokenizer(br.readLine(), " ");
			
			W[i] = Integer.parseInt(st.nextToken());
			V[i] = Integer.parseInt(st.nextToken());
		}
 
		System.out.println(knapsack(N - 1, K));
 
		br.close();
	}
 
	static int knapsack(int i, int k) 
	{
		// i�� 0 �̸�, �� ���� ���� �ȴٸ�
		if (i < 0)
			return 0;
		
		// Ž������ ���� ��ġ���?
		if (dp[i][k] == null) 
		{
			// ���� ����(i)�� �߰��� ����� ��� (���� i�� Ž��) 
			if(W[i] > k) 
			{
				dp[i][k] = knapsack(i - 1, k);
			}
			// ���� ����(i)�� ���� �� �ִ� ��� 
			else 
			{
				// ���� i���� ���� i���� ���� k-W[i]�� �� + ���� ��ġ(V[i])�� ū ���� ����  
				dp[i][k] = Math.max(knapsack(i - 1, k), knapsack(i - 1, k - W[i]) + V[i]);
			}
		}
		
		return dp[i][k];
	}
}