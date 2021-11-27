package stage_09;

import java.util.Scanner;

public class Test1085 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		if(h-y>y)	// y값이 더 작은 경우
		{
			if(w-x>x)
			{
				if(y>x)
					System.out.println(x);
				else
					System.out.println(y);
			}
			else
			{
				if(y>w-x)
					System.out.println(w-x);
				else
					System.out.println(y);
			}
		}
		else	// h-y값이 더 작은 경우
		{
			if(w-x>x)
			{
				if(h-y>x)
					System.out.println(x);
				else
					System.out.println(h-y);
			}
			else
			{
				if(h-y>w-x)
					System.out.println(w-x);
				else
					System.out.println(h-y);
			}
		}
		
		sc.close();
	}
}
