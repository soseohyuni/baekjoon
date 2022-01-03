import java.util.Scanner;

public class Test15650 
{
	public static int[] arr;
	public static StringBuilder sb = new StringBuilder();
	public static int n, m;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[m];
		
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
			nm(i+1, depth+1);
		}
	}
}
