import java.util.Scanner;

public class Test13305
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		long[] dist = new long[N-1];	// �Ÿ�
		long[] cost = new long[N];		// ��� 
		
		// �Ÿ� �Է� 
		for(int i=0; i<N-1; i++) 
		{
			dist[i] = sc.nextLong();
		}
		
		// ���ʹ� �⸧�� �Է�
		for(int i = 0; i < N; i++) 
		{
			cost[i] = sc.nextLong();
		}
		
		long sum = 0;
		long minCost = cost[0];		// ���� ������ ���� �� ���� �ּ� ��� 
 
		for(int i=0; i<N-1; i++) 
		{
			// ** �⸧���� ���������� ��쿡 ����
			// ���� �����Ұ� ���� �������� �⸧������ �� ���
			// minCost�� �������ش�. 
			if(cost[i] < minCost) 
				minCost = cost[i];
			
			sum += (minCost * dist[i]);	// �� ��� ���� ��
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
