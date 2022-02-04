import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test11866 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Queue<Integer> que = new LinkedList<Integer>();
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		sb.append("<");
		
		for(int i=1; i<N+1; i++)
		{
			que.add(i);
		}
		
		while(que.size() > 1) 
		{
			for(int i=0; i<K-1; i++) 
			{
				int val = que.poll();
				que.add(val);
			}
			
			sb.append(que.poll()).append(", ");
		}
 
		sb.append(que.poll()).append(">");
		System.out.println(sb);
		
		sc.close();
	}
}
