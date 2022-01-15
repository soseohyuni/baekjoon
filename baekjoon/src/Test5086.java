import java.util.Scanner;

public class Test5086 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.MAX_VALUE;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) 
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a==0 && b==0)
				break;
			
			if(b%a==0)
				sb.append("factor\n");
			else if(a%b==0)
				sb.append("multiple\n");
			else
				sb.append("neither\n");
		}
		
		System.out.println(sb);
		
		sc.close();
	}
}
