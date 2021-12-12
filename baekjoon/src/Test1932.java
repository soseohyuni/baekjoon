import java.util.Scanner;

public class Test1932 
{
	public static int[] arr;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=n; i++)
		{
			sum += i;
		}
		
		arr = new int[sum];
		
		for(int i=0; i<sum; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int temp = 2;
		
		int tot = 0;
		
			if(n==1)
				System.out.println(arr[0]);
			else
			{
				for(int j=2; j<=n; j++)
				{
					tot += Math.min(arr[temp+2], arr[temp+3]);

					temp += j;
				}
				
				System.out.println(tot);
			}
		
		sc.close();
	}
	
}
