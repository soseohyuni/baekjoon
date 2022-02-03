import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test18258 
{
	public static void main(String[] args) throws IOException
	{
		Queue<Integer> queue = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int last = 0;
		
		for(int i=0; i<N; i++)
		{
			st = new StringTokenizer(br.readLine(), " ");	// 문자열 분리 
			
			switch(st.nextToken())
			{
				case "push":
					last = Integer.parseInt(st.nextToken());
					queue.offer(last);
					break;
					
				case "front":
					if(queue.isEmpty())
						sb.append(-1).append('\n');
					else
						sb.append(queue.peek()).append('\n');
					break;
					
				case "empty":
					if(queue.isEmpty())
						sb.append(1).append('\n');
					else
						sb.append(0).append('\n');
					break;
					
				case "size":
					sb.append(queue.size()).append('\n');
					break;
					
				case "back":
					if(queue.isEmpty())
						sb.append(-1).append('\n');
					else
						sb.append(last).append('\n');
					break;
					
				case "pop":
					if(queue.isEmpty())
						sb.append(-1).append('\n');
					else
						sb.append(queue.remove()).append('\n');
					break;
			}
		}
		
		System.out.println(sb);
	}
}
