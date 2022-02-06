import java.util.LinkedList;
import java.util.Scanner;

public class Test1021 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Integer> dq = new LinkedList<Integer>();
		
		int cnt = 0;
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		for(int i=1; i<N+1; i++)
		{
			dq.offer(i);
		}
		
		int[] arr = new int[M];
		
		for(int i=0; i<M; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<M; i++)
		{
			int idx = dq.indexOf(arr[i]);
			int half_idx;
			
			// 덱의 원소의 갯수가 짝수라면
			if(dq.size()%2==0)
				half_idx = dq.size()/2 - 1;
			// 덱의 원소의 갯수가 홀수라면
			else
				half_idx = dq.size()/2;
		
			// 중간 지점 또는 중간 지점 보다 원소의 위치가 앞에 있을 경우 (2번 사용)
			if(idx <= half_idx)
			{
				for(int j=0; j<idx; j++)
				{
					int temp = dq.pollFirst();
					dq.offerLast(temp);
					cnt++;
				}
			}
			// 중간 지점보다 원소의 위치가 뒤에 있을 경우 (3번 사용)
			else
			{
				for(int j=0; j<dq.size()-idx; j++)
				{
					int temp = dq.pollLast();
					dq.offerFirst(temp);
					cnt++;			
				}
			}
			
			dq.pollFirst();
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
}
