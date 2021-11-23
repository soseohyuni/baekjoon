import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test10757 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String str_A = st.nextToken();
		String str_B = st.nextToken();
		
		// �� ���� �� �� ���� �� �ڸ��� ���̸� ���ص�
		int max_length = Math.max(str_A.length(), str_B.length());
		
		int[] A = new int[max_length + 1];	// ������ �ڸ��� �ø��� ���� �� �����Ƿ� +1
		int[] B = new int[max_length + 1];	// ������ �ڸ��� �ø��� ���� �� �����Ƿ� +1
		
		// A �ʱ�ȭ 
		for(int i = str_A.length() - 1, idx = 0; i >= 0; i--, idx++) 
		{
			A[idx] = str_A.charAt(i) - '0';	// �� �� ���ں��� �������� �ϳ��� ����
		}
		
		// B �ʱ�ȭ
		for(int i = str_B.length() - 1, idx = 0; i >= 0; i--, idx++) 
		{
			B[idx] = str_B.charAt(i) - '0';	// �� �� ���ں��� �������� �ϳ��� ����
		}
		
		
		for(int i = 0; i < max_length; i++) 
		{
			int value = A[i] + B[i];
			A[i] = value % 10;		// ���� ���� 10���� ���� �������� �ڸ����� ��
			A[i + 1] += (value / 10);	// ���� ���� 10���� ���� ���� �ø����� ��
		}
		
		// A�迭 ���� ���
		// ���� ���� �ڸ����� 0�� ���� �ֱ� ������ 0�� �ƴ� ��쿡�� ���
		StringBuilder sb = new StringBuilder();
		if(A[max_length] != 0)
			sb.append(A[max_length]);
		
		for(int i = max_length - 1; i >= 0; i--) 
		{
			sb.append(A[i]);
		}
		
		System.out.println(sb);
		
		br.close();
		
		/*
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		
		A = A.add(B);
		
		System.out.println(A.toString());
		*/
	}
}
