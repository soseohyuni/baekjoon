import java.util.Scanner;
 
public class Test1193 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
 
		int cross_count = 1, prev_count_sum = 0;
 
		while (true) 
		{
			// ���� �밢�� ������ + �ش� �밢�� ���� �̿��� ���� �Ǻ�
			if (X <= prev_count_sum + cross_count) 
			{	
				if (cross_count % 2 == 1) 
				{	
					// �밢���� ������ Ȧ����� 
					// �и� ū ������ ����
					// �и�� �밢�� ���� - (X ��° - ���� �밢�������� ������ - 1) 
					// ���ڴ� X ��° - ���� �밢�������� ������ 
					System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
					break;
				} 
				
				else 
				{	
					// �밢���� ������ ¦����� 
					// Ȧ���� ���� ����� �ݴ�� 
					System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
					break;
				}
 
			} 
			else 
			{
				prev_count_sum += cross_count;
				cross_count++;
			}
		}
		
		sc.close();
	}
}