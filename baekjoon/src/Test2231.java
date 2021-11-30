import java.util.Scanner;

public class Test2231 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int index = n;
		int res = 0;
		
		while(index>0)
		{
			index--;
			int com = index;
			int unit = index;
			
			while(unit != 0)
			{
				com += unit % 10;
				unit /= 10;
			}
			
			if(com == n)
				res = index;
		}
		
		System.out.println(res);
	}
}
