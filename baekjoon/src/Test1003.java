import java.util.Scanner;

public class Test1003 
{
	// ���ȣ���� �� �� �̹� �� �� Ž��(����)�ߴ� ���� �ִٸ� �Ǵٽ� �����ϴ� ���� �ƴ϶� 
	// �̹� ���� ���� �����Ͽ� �ݺ����� ��������� ���̴� ����� DPǮ���� ����
	
	static Integer[][] dp = new Integer[41][2];
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		dp[0][0] = 1;	// N=0 �� ���� 0 ȣ�� Ƚ��
		dp[0][1] = 0;	// N=0 �� ���� 1 ȣ�� Ƚ��
		dp[1][0] = 0;	// N=1 �� ���� 0 ȣ�� Ƚ��
		dp[1][1] = 1;	// N=1 �� ���� 1 ȣ�� Ƚ��
		
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
		// N�� ���� 0, 1�� ȣ�� Ƚ���� ���� ��(Ž������ ���� ���� ��)
		if(dp[N][0] == null || dp[N][1] == null) 
		{
			// �� N�� ���� 0 ȣ�� Ƚ���� 1 ȣ�� Ƚ���� ���ȣ���Ѵ�.
			dp[N][0] = fibonacci(N - 1)[0] + fibonacci(N - 2)[0];
			dp[N][1] = fibonacci(N - 1)[1] + fibonacci(N - 2)[1];
		}
		// N�� ���� 0�� 1, �� [N][0]�� [N][1] �� ����ִ� [N]�� ��ȯ�Ѵ�.
		return dp[N];
 
	}
		/*  => �ð� �ʰ��� �ڵ�
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
