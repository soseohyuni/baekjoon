import java.util.Scanner;
import java.util.Stack;

public class Test4949 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		 
		String s;
		
		while(true) 
		{		
			s = sc.nextLine();
			
			if(s.equals(".")) 
				break;
			
			System.out.println(solve(s));
		}
		
		sc.close();
	}
	
	public static String solve(String s) 
	{
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<s.length(); i++) 
		{
			char c = s.charAt(i);
			
			if(c == '(' || c == '[')
				stack.push(c);
			else if(c == ')')
			{
				// 스택이 비어있거나 pop할 원소가 소괄호랑 매칭이 안되는 경우
				// ★ peek : 최근에 추가된 데이터 조회
				if(stack.empty() || stack.peek() != '(')
					return "no";
				else 
					stack.pop();
			}
			else if(c == ']') 
			{
				if(stack.empty() || stack.peek() != '[') 
					return "no";
				else 
					stack.pop();
			}
		}
		
		if(stack.empty()) 
			return "yes";
		else 
			return "no";
	}
}