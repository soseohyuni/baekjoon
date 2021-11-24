import java.util.Scanner;

public class Test1011 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i<t; i++) 
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int distance = y - x;	// 거리
			
			int max = (int)Math.sqrt(distance);	// 소수점 버림
            
			if(max == Math.sqrt(distance))
				System.out.println(max * 2 - 1);
			else if(distance <= max * max + max)
				System.out.println(max * 2);
			else
				System.out.println(max * 2 + 1);
		}
		
		sc.close();
	}
}
