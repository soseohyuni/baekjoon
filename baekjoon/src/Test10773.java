import java.util.Scanner;

public class Test10773 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		int[] arr = new int[K];
		int[] res = new int[K];
		int last = 1;
		int tot =0;
		
		for(int i=0; i<K; i++)
		{
			arr[i] = sc.nextInt();
		}

		res[0] = arr[0];
	
		for(int i=1; i<K; i++)
		{	
			if(arr[i] != 0)
			{
				res[last] = arr[i];
				last++;
			}
			else if(arr[i] == 0)
			{
				res[last-1] = 0;
				last -= 1;
			}
		}
		
		for(int i : res)
		{
			tot += i;
		}
		
		System.out.println(tot);
		
		sc.close();
	}
}
