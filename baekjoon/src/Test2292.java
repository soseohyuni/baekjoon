import java.util.Scanner;

public class Test2292 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int num = 6;
		int cnt = 1;
		
		int a = 2;
		int b = 7;
		
		while(true)
		{
			if(n>=a && n<=b)
			{
				cnt++;
				break;
			}
			else if(n==1)
				break;
			else
				cnt++;
			
			a += num;
			b += num + 6;
			
			num += 6;
		}
		
		sc.close();
		
		System.out.println(cnt);
	}
}
