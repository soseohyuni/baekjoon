import java.util.Scanner;

public class Test15652
{
	// 비내림차순, 중복허용 
	
	public static int[] arr;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();
	public static int n,m;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[m];
		visit = new boolean[n];
		
		nm(1, 0);
		
		System.out.println(sb);
		
		sc.close();
	}
	
	public static void nm(int at, int depth)
	{
		if(depth == m)
		{
			for(int num : arr)
			{
				sb.append(num).append(' ');
			}
			
			sb.append('\n');
			
			return;
		}
		
		for(int i=at; i<=n; i++)
		{
			arr[depth] = i;
			nm(i, depth+1);
		}
	}
}
