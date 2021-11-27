

import java.util.Scanner;

public class Test9020 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++)
		{
			int n = sc.nextInt();
			boolean bigcheck = true;
			
			// Á¦°ö±Ù n <= ¼Ò¼ö <= n/2
			for(int j=n/2; j>=Math.sqrt(n); j--)
			{
				boolean check = true;
				
				for(int k=2; k<=Math.sqrt(n); k++)
				{
					if(j==2)
						continue;
					
					if(j%k==0 || (n-j)%k==0)
					{
						check = false;
						break;
					}
				}
				
				if(check && bigcheck)
				{
					System.out.println(j + " " + (n-j));
					bigcheck = false;
				}
			}
		}
		
		sc.close();
		
	}
}
