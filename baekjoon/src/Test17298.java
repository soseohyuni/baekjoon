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
			 * ������ ������� �����鼭 
			 * ���� ���Ұ� ������ �� �� ���Ұ� ����Ű�� ���Һ��� ū ���
			 * �ش� ������ ������ �� ���� stack�� ���Ҹ� pop�ϸ鼭
			 * �ش� �ε����� ���� ���� ���ҷ� �ٲ��ش�. 
			 */
			while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) 
			{
				arr[stack.pop()] = arr[i];
			}
			
			stack.push(i);
		}

		// ���ÿ� ���� �ִ� ��ҵ��� pop�ϸ鼭 -1 �� �ʱ�ȭ
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
