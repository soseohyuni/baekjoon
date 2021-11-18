import java.util.Scanner;

public class Test1712 
{
	public static void main(String[ ] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// a 고정비용  b 가변비용  c 판매비용  n 판매량
		
		sc.close();
		
		if(c<=b)
			System.out.println("-1");
		else
			System.out.println((a/(c-b))+1);
	}
}
