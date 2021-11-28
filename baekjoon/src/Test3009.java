import java.util.Scanner;

public class Test3009 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] xArr = new int[3];
		int[] yArr = new int[3];
		int x, y = 0;
		
		for(int i=0; i<3; i++)
		{
			xArr[i] = sc.nextInt();
			yArr[i] = sc.nextInt();
		}
		
		// x 값 구하기
		if(xArr[0]!=xArr[1])
		{
			if(xArr[0]==xArr[2])
				x = xArr[1];
			else
				x = xArr[0];
		}
		else
			x = xArr[2];
		
		// y 값 구하기
		if(yArr[0]!=yArr[1])
		{
			if(yArr[0]==yArr[2])
				y = yArr[1];
			else
				y = yArr[0];
		}
		else
			y = yArr[2];
		
		System.out.println(x + " " + y);
		sc.close();
	}
}
