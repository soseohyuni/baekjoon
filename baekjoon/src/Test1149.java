import java.util.Scanner;

public class Test1149 
{
	final static int red = 0;
	final static int green = 1;
	final static int blue = 2;
	
	static int[][] cost;
	static int[][] dp;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		cost = new int[N][3];
		dp = new int[N][3];
		
		for(int i=0; i<N; i++)
		{
			cost[i][red] = sc.nextInt();
			cost[i][green] = sc.nextInt();
			cost[i][blue] = sc.nextInt();
		}
		
		dp[0][red] = cost[0][red];
		dp[0][green] = cost[0][green];
		dp[0][blue] = cost[0][blue];
		
		System.out.print(Math.min(Paint_cost(N-1, red), Math.min(Paint_cost(N-1, green), Paint_cost(N-1, blue))));
		
		sc.close();
	}
	
	static int Paint_cost(int n, int color)
	{
		// ���� Ž������ ���� �迭�̶��
		if(dp[n][color] == 0)
		{	
			// color�� ���� ���� ���� ���� ���� �ٸ� ���� ���ȣ���Ͽ� �ּڰ��� ���� ���� ����� ���ؼ� DP�� �����Ѵ�
			if(color==red)
				dp[n][red] = Math.min(Paint_cost(n-1, green), Paint_cost(n-1, blue)) + cost[n][red];
			else if(color==green)
				dp[n][green] = Math.min(Paint_cost(n-1, red), Paint_cost(n-1, blue)) + cost[n][green];
			else
				dp[n][blue] = Math.min(Paint_cost(n-1, red), Paint_cost(n-1, green)) + cost[n][blue];
		}
		
		return dp[n][color];
	
	}
}
