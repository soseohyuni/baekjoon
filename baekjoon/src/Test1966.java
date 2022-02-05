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
					// ó�� ���� ���Һ��� ť�� �ִ� i��° ���Ұ� �߿䵵�� Ŭ ��� 
					if(front[1] < que.get(i)[1]) 
					{
						// ���� ���� �� i ������ ���ҵ��� �ڷ� ������.
						que.offer(front);
						
						for(int j=0; j<i; j++) 
						{
							que.offer(que.poll());
						}
						
						// front���Ұ� ���� ū ���Ұ� �ƴϿ����Ƿ� false�� �ϰ� Ž���� ��ħ
						isMax = false;
						break;
					}
				}
				
				// front ���Ұ� ���� ū ���Ұ� �ƴϿ����Ƿ� ���� �ݺ������� �Ѿ
				if(isMax == false)
					continue;
				
				count++;
				
				// ã���� �ϴ� ������� �ش� �׽�Ʈ���̽� ����
				if(front[0] == M)	
					break;
			}
 
			sb.append(count).append('\n');
		}
		
		System.out.println(sb);
		
		sc.close();
	}
}
