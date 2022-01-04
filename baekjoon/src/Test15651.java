import java.util.Scanner;

public class Test15651 
{
	public static int[] arr;
	public static StringBuilder sb = new StringBuilder();
	public static int n,m;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[m];
		
		nm(n, m, 0);
		
		System.out.println(sb);
		
		sc.close();
	}
	
	public static void nm(int n, int m, int depth)
	{
		if(depth == m)
		{
			// 한번에 몰아서 출력하기
			for(int num : arr)
			{
				sb.append(num).append(' ');
			}
			
			sb.append('\n');
			
			return;
		}
		
		for(int i=0; i<n; i++)
		{
			arr[depth] = i+1;
			nm(n, m, depth+1);
		}
	}
}
