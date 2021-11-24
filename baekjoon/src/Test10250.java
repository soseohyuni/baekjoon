import java.util.Scanner;

public class Test10250 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++)
		{
			int h = sc.nextInt(); // 類 熱
			int w = sc.nextInt(); // 寞 熱
			int n = sc.nextInt(); // 賃廓簞 槳椒
			
			int x = (n/h)+1; // �ˉ�
			int y = n%h; // 類熱
			
			// 裔 窕渠晦 類曖 唳辦
			if(y==0)
			{
				y=h;
				x=x-1;
			}
			
			if(x<10)
				System.out.println(String.valueOf(y)+"0"+String.valueOf(x));
			else
				System.out.println(String.valueOf(y)+String.valueOf(x));
		}
		
		sc.close();
	}
}
