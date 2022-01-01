import java.util.Scanner;

public class Test15649 
{
	public static int[] arr;
	public static boolean[] visit;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		arr = new int[m];
		visit = new boolean[n];
		
		nm(n, m, 0);
		
		sc.close();
	}
	
	public static void nm(int n, int m, int depth)
	{
		if(depth == m)
		{
			for(int num : arr)
			{
				System.out.print(num + " ");
			}
			
			System.out.println();
			
			return;
		}
		
		for(int i=0; i<n; i++)
		{
			if(!visit[i])
			{
				visit[i] = true;
				arr[depth] = i+1;
				nm(n, m, depth+1);
				visit[i] = false;
			}
		}
	}
}
