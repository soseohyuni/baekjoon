import java.util.Scanner;

public class Test1912 
{
	static int[] arr;		
	static Integer[] dp;	
	static int max;
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		arr = new int[n];
		dp = new Integer[n];
		
		for(int i=0; i<n; i++) 
		{
			arr[i] = sc.nextInt();
		}

		dp[0] = arr[0];
		max = arr[0];
		
		recur(n - 1);
		
		System.out.println(max);
		
		sc.close();
	}
	
	static int recur(int N) 
	{
		if(dp[N] == null) 
		{
			dp[N] = Math.max(recur(N - 1) + arr[N], arr[N]);
 
			max = Math.max(dp[N], max);
		}
		
		return dp[N];
	}
}