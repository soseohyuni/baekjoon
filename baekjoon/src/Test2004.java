import java.util.Scanner;

public class Test2004 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		long M = sc.nextLong();
		
		long cnt5 = five_n(N) - five_n(N-M) - five_n(M);
		long cnt2 = two_n(N) - two_n(N-M) - two_n(M);

		System.out.println(Math.min(cnt5, cnt2));
		
		sc.close();
	}
	
	static long five_n(long num)
	{
		int cnt = 0;
		
		while(num >= 5)
		{
			cnt += (num/5);
			num /= 5;
		}
		
		return cnt;
	}
	
	static long two_n(long num)
	{
		int cnt = 0;
		
		while(num >= 2)
		{
			cnt += (num/2);
			num /= 2;
		}
		
		return cnt;
	}
}
