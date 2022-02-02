import java.util.Scanner;
import java.util.Stack;

public class Test17298 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) 
		{
			arr[i] = sc.nextInt();
		}
 
		for(int i=0; i<N; i++) 
		{
			/*
			 * 스택이 비어있지 않으면서 
			 * 현재 원소가 스택의 맨 위 원소가 가리키는 원소보다 큰 경우
			 * 해당 조건을 만족할 때 까지 stack의 원소를 pop하면서
			 * 해당 인덱스의 값을 현재 원소로 바꿔준다. 
			 */
			while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) 
			{
				arr[stack.pop()] = arr[i];
			}
			
			stack.push(i);
		}

		// 스택에 남아 있는 요소들을 pop하면서 -1 로 초기화
		while(!stack.isEmpty()) 
		{
			arr[stack.pop()] = -1;
		}
		
		for(int i=0; i<N; i++) 
		{
			sb.append(arr[i]).append(' ');
		}
		
		System.out.println(sb);
		
		sc.close();
	}
}
