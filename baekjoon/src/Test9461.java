import java.util.Scanner;

public class Test9461 
{
	public static Long[] dp = new Long[101];
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		dp[0] = 0L;
		dp[1] = 1L;
		dp[2] = 1L;
		dp[3] = 1L;
	
		while(n-- > 0)
		{
			int num = sc.nextInt();
			System.out.println(padovan(num));
		}
		
		sc.close();
	}
	
	public static long padovan(int n)
	{
		if(dp[n]==null)
			dp[n] = padovan(n-2) + padovan(n-3);
		
		return dp[n];
	}
}
