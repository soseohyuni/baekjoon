import java.util.Scanner;

public class Test17298 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<N; i++)
		{
			if(i==N-1)
			{
				sb.append("-1");
				break;
			}
			
			int max = arr[i]; 
			
			for(int j=i+1; j<N; j++)
			{
				if(max<arr[j])
				{
					sb.append(arr[j] + " ");
					break;
				}
				else
				{
					if(j==N-1)
					{
						sb.append("-1 ");
						break;
					}
				}	
			}
		}
		
		System.out.println(sb);
		
		sc.close();
	}
}
