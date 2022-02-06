import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Test10866 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Deque<Integer> dq = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		while(N-- > 0)
		{
			switch (sc.next()) 
			{
				case "push_front":
					dq.offerFirst(sc.nextInt());
					break;
				
				case "push_back":
					dq.offerLast(sc.nextInt());
					break;
					
				case "pop_front":
					if(dq.isEmpty())
						sb.append("-1").append('\n');
					else
						sb.append(dq.poll()).append('\n');
					break;
				
				case "pop_back":
					if(dq.isEmpty())
						sb.append("-1").append('\n');
					else
						sb.append(dq.pollLast()).append('\n');
					break;
					
				case "size":
					sb.append(dq.size()).append('\n');
					break;
					
				case "empty":
					if(dq.isEmpty())
						sb.append("1").append('\n');
					else
						sb.append("0").append('\n');
					break;
					
				case "front":
					if(dq.isEmpty())
						sb.append("-1").append('\n');
					else
						sb.append(dq.peekFirst()).append('\n');
					break;
				
				case "back":
					if(dq.isEmpty())
						sb.append("-1").append('\n');
					else
						sb.append(dq.peekLast()).append('\n');
					break;
			}
		}
		
		System.out.println(sb);
		
		sc.close();
	}
}
