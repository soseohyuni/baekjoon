import java.util.Scanner;

public class Test14889 
{
	public static int n;
	public static int min = Integer.MAX_VALUE;
	public static int[][] arr;
	public static boolean[] visit;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		arr = new int[n][n];
		visit = new boolean[n];
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		team(0, 0);
		System.out.println(min);
		
		sc.close();
	}

	// idx �� �ε���, cnt �� ���� ����(��� ����)
	public static void team(int idx, int cnt)
	{
		// ������ �ϼ����� ��
		if(cnt==n/2)
		{
			diff();
			return;
		}
		
		for(int i=idx; i<n; i++)
		{
			if(!visit[i])
			{
				visit[i] = true;
				team(i+1, cnt+1);
				visit[i] = false;
			}
		}
	}
	
	// �� ���� �ɷ�ġ ���̸� ���
	public static void diff()
	{
		int team_start = 0;
		int team_link = 0;
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				// i��° ����� j��° ����� true ��� ��ŸƮ������ ���� �÷���
				if(visit[i]==true && visit[j]==true)
				{
					team_start += arr[i][j];
					team_start += arr[j][i];
				}
				// i��° ����� j��° ����� false ��� ��ũ������ ���� �÷���
				else if(visit[i]==false && visit[j]==false)
				{
					team_link += arr[i][j];
					team_link += arr[j][i];
				}
			}
		}
		
		// �� ���� ���� ���� ���ϱ�
		int val = Math.abs(team_start - team_link);
		
		// 0�̶�� ���� ���� �ּڰ��̱� ������ ����ϰ� ����
		if(val == 0)
		{
			System.out.println(val);
			System.exit(0);
		}
		
		min = Math.min(val, min);
	}
}
