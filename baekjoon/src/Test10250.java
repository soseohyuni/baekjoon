import java.util.Scanner;

public class Test10250 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++)
		{
			int h = sc.nextInt(); // �� ��
			int w = sc.nextInt(); // �� ��
			int n = sc.nextInt(); // ���° �մ�
			
			int x = (n/h)+1; // ȣ��
			int y = n%h; // ����
			
			// �� ����� ���� ���
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
