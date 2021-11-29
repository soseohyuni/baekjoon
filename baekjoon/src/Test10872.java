import java.util.Scanner;

public class Test10872 
{
	public static void main(String[ ] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 1;
		
		for(int i=1; i<=n; i++)
		{
			result *= i;
		}

		if(n==0)
			System.out.println("1");
		else
			System.out.println(result);
		
		sc.close();
	}
}