import java.util.Scanner;
import java.util.Stack;

public class Test1874 
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stack = new Stack<>();
		
		int N = sc.nextInt();
		
		int start = 0;
		
		while(N-- > 0) 
		{
			int value = sc.nextInt();
			
			if(value > start) 
			{
				for(int i=start+1; i<=value; i++) 
				{
					stack.push(i);
					sb.append('+').append('\n');
				}
				
				// 다음 push 할 때의 오름차순을 유지하기 위한 변수 초기화 
				start = value;
			}
			
			// top에 있는 원소가 입력받은 값과 같이 않은 경우  
			else if(stack.peek() != value) 
			{
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			sb.append('-').append('\n');
			
		}
		
		System.out.println(sb);
		
		sc.close();
	}
}
