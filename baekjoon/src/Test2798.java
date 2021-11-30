import java.util.Scanner;

public class Test2798 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
	
		int[] arr = new int[n];
		int sum, temp = 0;
		
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				for(int k=j+1; k<n; k++)
				{
					sum = arr[i] + arr[j] + arr[k];
					
					if(temp<sum && sum<=m)
						temp = sum;
				}
			}
		}
		
		System.out.println(temp);
		sc.close();
	}
}
