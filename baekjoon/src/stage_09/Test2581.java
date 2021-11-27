package stage_09;
import java.util.Scanner;

public class Test2581 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int hap = 0;
		int min = 0;
		
		for(int i=n; i>=m; i--)
		{
			if(i==1)
				continue;
			
			boolean check = true;
			hap += i;
			
			for(int j=2; j<=Math.sqrt(i); j++)
			{
				if(i%j==0)	// 소수가 아닌 경우
				{
					hap -= i;
					check = false;
					break;
				}
			}
			
			if(check)	// 소수인 경우
				min = i;
		}
		
		if(hap==0)
			System.out.println("-1");
		else
			System.out.println(hap+"\n"+min);
		
		sc.close();
	}
}
