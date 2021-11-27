package stage_09;
import java.util.Scanner;

public class Test1978 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int cnt = 0;
		
		for(int i=0; i<n; i++)
		{
			int x = sc.nextInt();
			boolean check = true;
			
			if(x==1)
				continue;
			
			for(int j=2; j<=Math.sqrt(n); j++)
			{
				if(x%j==0)	// 소수가 아닌 경우
				{
					check = false;
					break;
				}
			}
			
			if(check)
				cnt++;
		}
		
		sc.close();
		
		System.out.println(cnt);
	}
	
}
