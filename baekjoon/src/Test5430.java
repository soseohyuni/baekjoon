import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test5430 
{
	public static Scanner sc = new Scanner(System.in);
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args)
	{
		ArrayDeque<Integer> dq;
		StringTokenizer st;
		
		int T = sc.nextInt();
		
		while(T-- > 0)
		{
			String p = sc.next();
			int n = sc.nextInt();
			
			st = new StringTokenizer(sc.next(), "[],");
			
			dq = new ArrayDeque<Integer>();
			
			for(int i=0; i<n; i++) 
			{
				dq.add(Integer.parseInt(st.nextToken()));
			}
			
			AC(p, dq);
		}
		
		System.out.println(sb);
		
		sc.close();
	}
	
	public static void AC(String p, ArrayDeque<Integer> dq) 
	{
		// 방향 상태 변수
		boolean isRight = true;	
		
		for(char cmd : p.toCharArray()) 
		{
			if(cmd == 'R') 
			{
				// 방향을 바꿔준다.
				isRight = !isRight;	
				
				continue;
			}
			
			// D 함수이면서 isRight가 true 일 경우
			if(isRight) 
			{
				// 만약 반환 된 원소가 없을 경우 error를 출력하도록 하고 함수 종료
				if(dq.pollFirst() == null) 
				{
					sb.append("error\n");
					return;
				}
			}
			else 
			{
				// 만약 반환 된 원소가 없을 경우 error를 출력하도록 하고 함수 종료
				if(dq.pollLast() == null) 
				{
					sb.append("error\n");
					return;
				}	
			}
		}
		
		// 덱의 남은 요소들을 출력문으로 만들어준다.
		makePrintString(dq, isRight);
	}
	
	public static void makePrintString(ArrayDeque<Integer> dq, boolean isRight) 
	{
		sb.append('[');
		
		//만약 출력 할 원소가 한 개 이상일 경우
		if(dq.size() > 0) 
		{	
			// 정방향일경우 
			if(isRight) 
			{	
				// 먼저 첫 번째 원소를 넘겨준다.
				sb.append(dq.pollFirst());	
				
				// 그 다음 원소부터 반점을 먼저 넘겨준 후 덱의 원소를 하나씩 뽑아 넘긴다. 
				while(!dq.isEmpty()) 
				{
					sb.append(',').append(dq.pollFirst());
				}
			}
			// 역방향일경우
			else  
			{	
				// 먼저 뒤에서부터 첫 번째 원소를 넘겨준다.
				sb.append(dq.pollLast());	
				
				// 그 다음 원소부터 반점을 먼저 넘겨준 후 덱의 원소를 뒤에서부터 하나씩 뽑아 넘긴다. 
				while(!dq.isEmpty()) 
				{
					sb.append(',').append(dq.pollLast());
				}
			}
		}
		
		sb.append(']').append('\n');
	}
}
