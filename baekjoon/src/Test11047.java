import java.util.Scanner;

// �׸��� �˰���, Ž�� �˰���, �ٻ� �˰���
public class Test11047 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// ���� ���� ����
		int K = sc.nextInt();	// ��ġ�� ��
		int[] arr = new int[N];	// ���� ����
		int min = 0;			// �ּڰ�
		
		for(int i=0; i<N; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = N-1; i>=0; i--) 
		{
			if(arr[i] <= K) 
			{
				min += (K / arr[i]);
				K = K % arr[i];
			}
		}
		
		System.out.println(min);
		
		sc.close();
	}
}
