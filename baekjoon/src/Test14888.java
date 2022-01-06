import java.util.Scanner;

public class Test14888 
{
	public static int max = Integer.MIN_VALUE;	// �ִ� 
	public static int min = Integer.MAX_VALUE;	// �ּڰ� 
	public static int[] op = new int[4];		// ������ ���� 
	public static int[] num;					// ���� 
	public static int n;						// ���� ���� 
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
 
		n = sc.nextInt();
		num = new int[n];
 
		// ���� �Է�
		for (int i=0; i<n; i++) 
		{
			num[i] = sc.nextInt();
		}
 
		// ������ �Է�
		for (int i=0; i<4; i++) 
		{
			op[i] = sc.nextInt();
		}
 
		dfs(num[0], 1);
 
		System.out.println(max);
		System.out.println(min);
		
		sc.close();
 
	}
 
	// idx �� ����
	public static void dfs(int number, int idx) 
	{
		// n��°���� �� ������ ���
		if (idx == n) 
		{
			max = Math.max(max, number);
			min = Math.min(min, number);
			return;
		}
 
		for (int i=0; i<4; i++) 
		{
			// ������ ������ 1�� �̻��� ���
			if (op[i] > 0)
			{
				// �ش� �����ڸ� 1 ���ҽ�Ų��.
				op[i]--;
 
				switch (i) 
				{
					case 0:	dfs(number + num[idx], idx + 1);	break;
					case 1:	dfs(number - num[idx], idx + 1);	break;
					case 2:	dfs(number * num[idx], idx + 1);	break;
					case 3:	dfs(number / num[idx], idx + 1);	break;
				}
				
				// ���ȣ���� ����Ǹ� �ٽ� �ش� ������ ������ �����Ѵ�.
				op[i]++;
			}
		}
	}
}
