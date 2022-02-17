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

	// idx 는 인덱스, cnt 는 조합 개수(재귀 깊이)
	public static void team(int idx, int cnt)
	{
		// 조합이 완성됐을 때
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
	
	// 두 팀의 능력치 차이를 계산
	public static void diff()
	{
		int team_start = 0;
		int team_link = 0;
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				// i번째 사람과 j번째 사람이 true 라면 스타트팀으로 점수 플러스
				if(visit[i]==true && visit[j]==true)
				{
					team_start += arr[i][j];
					team_start += arr[j][i];
				}
				// i번째 사람과 j번째 사람이 false 라면 링크팀으로 점수 플러스
				else if(visit[i]==false && visit[j]==false)
				{
					team_link += arr[i][j];
					team_link += arr[j][i];
				}
			}
		}
		
		// 두 팀의 점수 차이 구하기
		int val = Math.abs(team_start - team_link);
		
		// 0이라면 가장 낮은 최솟값이기 때문에 출력하고 종료
		if(val == 0)
		{
			System.out.println(val);
			System.exit(0);
		}
		
		min = Math.min(val, min);
	}
}
