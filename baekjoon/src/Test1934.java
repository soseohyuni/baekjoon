import java.util.Scanner;

public class Test1934 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] arr = new int[T];
		
		for(int i=0; i<T; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int d = lcm(a, b);
			
			arr[i] = a*b/d;
		}
		
		for(int n : arr)
		{
			System.out.println(n);
		}
		
		sc.close();
	}
	
	static int lcm(int a, int b)
	{
		if(b==0)
			return a;
		
		return lcm(b, a%b);
	}
}
