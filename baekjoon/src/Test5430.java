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
		// ���� ���� ����
		boolean isRight = true;	
		
		for(char cmd : p.toCharArray()) 
		{
			if(cmd == 'R') 
			{
				// ������ �ٲ��ش�.
				isRight = !isRight;	
				
				continue;
			}
			
			// D �Լ��̸鼭 isRight�� true �� ���
			if(isRight) 
			{
				// ���� ��ȯ �� ���Ұ� ���� ��� error�� ����ϵ��� �ϰ� �Լ� ����
				if(dq.pollFirst() == null) 
				{
					sb.append("error\n");
					return;
				}
			}
			else 
			{
				// ���� ��ȯ �� ���Ұ� ���� ��� error�� ����ϵ��� �ϰ� �Լ� ����
				if(dq.pollLast() == null) 
				{
					sb.append("error\n");
					return;
				}	
			}
		}
		
		// ���� ���� ��ҵ��� ��¹����� ������ش�.
		makePrintString(dq, isRight);
	}
	
	public static void makePrintString(ArrayDeque<Integer> dq, boolean isRight) 
	{
		sb.append('[');
		
		//���� ��� �� ���Ұ� �� �� �̻��� ���
		if(dq.size() > 0) 
		{	
			// �������ϰ�� 
			if(isRight) 
			{	
				// ���� ù ��° ���Ҹ� �Ѱ��ش�.
				sb.append(dq.pollFirst());	
				
				// �� ���� ���Һ��� ������ ���� �Ѱ��� �� ���� ���Ҹ� �ϳ��� �̾� �ѱ��. 
				while(!dq.isEmpty()) 
				{
					sb.append(',').append(dq.pollFirst());
				}
			}
			// �������ϰ��
			else  
			{	
				// ���� �ڿ������� ù ��° ���Ҹ� �Ѱ��ش�.
				sb.append(dq.pollLast());	
				
				// �� ���� ���Һ��� ������ ���� �Ѱ��� �� ���� ���Ҹ� �ڿ������� �ϳ��� �̾� �ѱ��. 
				while(!dq.isEmpty()) 
				{
					sb.append(',').append(dq.pollLast());
				}
			}
		}
		
		sb.append(']').append('\n');
	}
}
