import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test11729 
{
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		sb.append((int)(Math.pow(2, N) - 1)).append('\n');
 
		Hanoi(N, 1, 2, 3);
		System.out.println(sb);
	}
		
	public static void Hanoi(int N, int start, int mid, int to) 
	{
		// �̵��� ������ ���� 1�����?
		if(N == 1) 
		{
			sb.append(start + " " + to + "\n");
			return;
		}
		
		// STEP 1 : N-1���� A���� B�� �̵�
		Hanoi(N - 1, start, to, mid);
		
		// STEP 2 : 1���� A���� C�� �̵�
		sb.append(start + " " + to + "\n");
		
		// STEP 3 : N-1���� B���� C�� �̵�
		Hanoi(N - 1, mid, start, to);
	}
}
