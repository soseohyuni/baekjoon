import java.util.Scanner;

public class Test1003 
{
	// 재귀호출을 할 때 이미 한 번 탐색(연산)했던 값이 있다면 또다시 연산하는 것이 아니라 
	// 이미 계산된 값을 재사용하여 반복적인 연산과정을 줄이는 방법이 DP풀이의 기초
	
	static Integer[][] dp = new Integer[41][2];
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		dp[0][0] = 1;	// N=0 일 때의 0 호출 횟수
		dp[0][1] = 0;	// N=0 일 때의 1 호출 횟수
		dp[1][0] = 0;	// N=1 일 때의 0 호출 횟수
		dp[1][1] = 1;	// N=1 일 때의 1 호출 횟수
		
		while(n-- > 0)
		{
			int N = sc.nextInt();
			fibonacci(N);
			System.out.println(dp[N][0] + " " + dp[N][1]);
		}
		
		sc.close();
	}
	
	static Integer[] fibonacci(int N) 
	{
		// N에 대한 0, 1의 호출 횟수가 없을 떄(탐색하지 않은 값일 때)
		if(dp[N][0] == null || dp[N][1] == null) 
		{
			// 각 N에 대한 0 호출 횟수와 1 호출 횟수를 재귀호출한다.
			dp[N][0] = fibonacci(N - 1)[0] + fibonacci(N - 2)[0];
			dp[N][1] = fibonacci(N - 1)[1] + fibonacci(N - 2)[1];
		}
		// N에 대한 0과 1, 즉 [N][0]과 [N][1] 을 담고있는 [N]을 반환한다.
		return dp[N];
 
	}
		/*  => 시간 초과된 코드
		int[] arr = new int[n];
		int[][] num = new int[n][2];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
			fibonacci(arr[i], num, i);
		}
		
		for(int i=0; i<num.length; i++)
		{
			System.out.println(num[i][0] + " " + num[i][1]);
		}
		
		sc.close();
	}
	
	public static int fibonacci(int m, int[][] nums, int i) 
	{
	    if (m == 0) 
	    {
	    	nums[i][0]++;
	        return 0;
	    } 
	    else if (m == 1) 
	    {
	    	nums[i][1]++;
	        return 1;
	    } 
	    else 
	    {
	    	return fibonacci(m-1, nums, i) + fibonacci(m-2, nums, i);
	    }
	}
	*/
}
