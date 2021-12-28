import java.util.Scanner;

public class Test9251 
{
	static char str1[];
	static char str2[];
	
	static Integer dp[][];
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// toCharArray() �� ���ڿ��� char[] �迭�� ��ȯ���ִ� �޼ҵ�
		str1 = sc.nextLine().toCharArray();
		str2 = sc.nextLine().toCharArray();
		
		dp = new Integer[str1.length][str2.length];
		
		System.out.println(lcs(str1.length - 1, str2.length - 1));
		
		sc.close();
	}
	
	static int lcs(int x, int y)
	{
		// �������� ��� 0 ��ȯ
		if(x==-1 || y==-1)
			return 0;
		
		// ���� Ž������ ���� �ε������?
		if(dp[x][y] == null)
		{
			dp[x][y] = 0;
			
			// str1�� x��° ���ڿ� str2�� y��° ���ڰ� ������ �˻�
			if(str1[x] == str2[y])
				dp[x][y] = lcs(x-1, y-1) + 1;
			
			// ���� �ʴٸ� lcs(dp)[x-1][y]�� lcs(dp)[x,y-1] �� ū ������ �ʱ�ȭ
			else
				dp[x][y] = Math.max(lcs(x-1, y), lcs(x, y-1));
		}
		
		return dp[x][y];
	}
}
