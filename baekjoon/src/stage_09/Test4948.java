package stage_09;
import java.util.Scanner;

public class Test4948 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = 1;
		
		while(n!=0)
		{
			n = sc.nextInt();
			int cnt = 0;
			
			if(n==0)
				break;
			
			for(int i=n+1; i<=2*n; i++)
			{
				boolean check = true;
				
				for(int j=2; j<=Math.sqrt(i); j++)
				{
					if(i%j==0)
					{
						check = false;
						break;
					}
				}
				
				if(check)
					cnt++;
			}

			System.out.println(cnt);
		}
			
		sc.close();
	}
}
