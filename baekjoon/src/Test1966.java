import java.util.LinkedList;
import java.util.Scanner;

public class Test1966 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int T = sc.nextInt();
		
		while(T-- > 0)
		{
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			LinkedList<int[]> que = new LinkedList<>();
			
			for (int i = 0; i < N; i++) 
			{
				que.offer(new int[] { i, sc.nextInt() });
			}
 
			int count = 0;
			
			while(!que.isEmpty()) 
			{	
				int[] front = que.poll();	
				boolean isMax = true;		
				
				for(int i=0; i<que.size(); i++) 
				{
					// 처음 뽑은 원소보다 큐에 있는 i번째 원소가 중요도가 클 경우 
					if(front[1] < que.get(i)[1]) 
					{
						// 뽑은 원소 및 i 이전의 원소들을 뒤로 보낸다.
						que.offer(front);
						
						for(int j=0; j<i; j++) 
						{
							que.offer(que.poll());
						}
						
						// front원소가 가장 큰 원소가 아니였으므로 false를 하고 탐색을 마침
						isMax = false;
						break;
					}
				}
				
				// front 원소가 가장 큰 원소가 아니였으므로 다음 반복문으로 넘어감
				if(isMax == false)
					continue;
				
				count++;
				
				// 찾고자 하는 문서라면 해당 테스트케이스 종료
				if(front[0] == M)	
					break;
			}
 
			sb.append(count).append('\n');
		}
		
		System.out.println(sb);
		
		sc.close();
	}
}
