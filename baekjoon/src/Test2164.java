import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test2164
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		int N = sc.nextInt();
		
		for(int i=1; i<N+1; i++)
		{
			que.add(i);
		}
		
		int first = 0;
		
		for(int i=1; i<N+1; i++)
		{
			if(que.size()==1)
			{
				System.out.println(que.peek());
				break;
			}
			else
			{
				que.remove();
				first = que.peek();
				que.remove();
				que.add(first);
			}
		}
		
		sc.close();
	}
}
