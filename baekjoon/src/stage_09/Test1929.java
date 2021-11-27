package stage_09;
import java.util.Scanner;

public class Test1929 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sosu = 0;
		
		for(int i=m; i<=n; i++)
		{
			if(i==1)
				continue;
			
			boolean check = true;
			
			for(int j=2; j<=Math.sqrt(i); j++)
			{
				if(i%j==0)	// �Ҽ��� �ƴ� ���
				{
					check = false;
					break;
				}
			}
			
			if(check)	// �Ҽ��� ���
			{
				sosu = i;
				System.out.println(sosu);
			}
		}
		
		sc.close();
	}
}
