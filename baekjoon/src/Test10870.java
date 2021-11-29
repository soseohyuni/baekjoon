import java.util.Scanner;

public class Test10870 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n+1];

		if(n==0)
			System.out.println("0");
		else
		{
			arr[0] = 0;
			arr[1] = 1;
			
			for(int i=2; i<=n; i++)
			{
				arr[i] = arr[i-1] + arr[i-2];
			}
			
			System.out.println(arr[n]);
		}
		
		sc.close();
	}
}
