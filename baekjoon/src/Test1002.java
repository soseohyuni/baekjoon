import java.util.Scanner;

public class Test1002 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++)
		{
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
		
			System.out.println(tangent_point(x1, y1, r1, x2, y2, r2));
				
		}
		
		sc.close();
	}
	
	// ���� ���� ���ϴ� �Լ�
	public static int tangent_point(int x1, int y1, int r1, int x2, int y2, int r2) 
	{
		// ������ �Ÿ� distance�� ���� 
		int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));	

		// case 1 : ������ �����鼭 �������� ���� ���
		if(x1 == x2 && y1 == y2 && r1 == r2)
			return -1;
		
		// case 2-1 : �� ���� ������ �պ��� ������ �Ÿ��� �� �� �� 
		else if(distance_pow > Math.pow(r1 + r2, 2))
			return 0;
			
		// case 2-2 : �� �ȿ� ���� ������ �������� ���� �� 
		else if(distance_pow < Math.pow(r2 - r1, 2))
			return 0;
		
		// case 3-1 : ������ �� 
		else if(distance_pow == Math.pow(r2 - r1, 2))
			return 1;
		
		// case 3-2 : ������ �� 
		else if(distance_pow == Math.pow(r1 + r2, 2))
			return 1;
		
		else
			return 2;
		
	}
}
