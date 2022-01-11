import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 활동 선택 문제
// 종료시간을 기준으로 정렬 → 진행시간이 짧은 것을 선택
public class Test1931 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] arr = new int[N][2];
		int cnt = 0;
		int endTime = 0;
		
		for(int i=0; i<N; i++)
		{
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		// 종료시간을 기준으로 정렬하기 위해 compare 재정의
		Arrays.sort(arr, new Comparator<int[]>() 
		{
			@Override
			public int compare(int[] a, int[] b)
			{
				// 종료시간이 같을 경우 시작시간이 빠른 순으로 정렬
				if(a[1] == b[1])
					return a[0] - b[0];
				
				return a[1] - b[1];
			}
		});
		
		
		for(int i=0; i<N; i++)
		{
			if(arr[i][0]>=endTime)
			{
				endTime = arr[i][1];
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
}
