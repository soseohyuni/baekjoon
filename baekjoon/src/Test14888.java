import java.util.Scanner;

public class Test14888 
{
	public static int max = Integer.MIN_VALUE;	// 최댓값 
	public static int min = Integer.MAX_VALUE;	// 최솟값 
	public static int[] op = new int[4];		// 연산자 개수 
	public static int[] num;					// 숫자 
	public static int n;						// 숫자 개수 
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
 
		n = sc.nextInt();
		num = new int[n];
 
		// 숫자 입력
		for (int i=0; i<n; i++) 
		{
			num[i] = sc.nextInt();
		}
 
		// 연산자 입력
		for (int i=0; i<4; i++) 
		{
			op[i] = sc.nextInt();
		}
 
		dfs(num[0], 1);
 
		System.out.println(max);
		System.out.println(min);
		
		sc.close();
 
	}
 
	// idx 는 깊이
	public static void dfs(int number, int idx) 
	{
		// n번째까지 다 끝나면 출력
		if (idx == n) 
		{
			max = Math.max(max, number);
			min = Math.min(min, number);
			return;
		}
 
		for (int i=0; i<4; i++) 
		{
			// 연산자 개수가 1개 이상인 경우
			if (op[i] > 0)
			{
				// 해당 연산자를 1 감소시킨다.
				op[i]--;
 
				switch (i) 
				{
					case 0:	dfs(number + num[idx], idx + 1);	break;
					case 1:	dfs(number - num[idx], idx + 1);	break;
					case 2:	dfs(number * num[idx], idx + 1);	break;
					case 3:	dfs(number / num[idx], idx + 1);	break;
				}
				
				// 재귀호출이 종료되면 다시 해당 연산자 개수를 복구한다.
				op[i]++;
			}
		}
	}
}
