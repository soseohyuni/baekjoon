import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Ȱ�� ���� ����
// ����ð��� �������� ���� �� ����ð��� ª�� ���� ����
public class Test1931 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] arr = new int[N][2];
		int cnt = 0;
		int endTime = 0;
		
		for(int i=0; i<N; i++)
		{
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		// ����ð��� �������� �����ϱ� ���� compare ������
		Arrays.sort(arr, new Comparator<int[]>() 
		{
			@Override
			public int compare(int[] a, int[] b)
			{
				// ����ð��� ���� ��� ���۽ð��� ���� ������ ����
				if(a[1] == b[1])
					return a[0] - b[0];
				
				return a[1] - b[1];
			}
		});
		
		
		for(int i=0; i<N; i++)
		{
			if(arr[i][0]>=endTime)
			{
				endTime = arr[i][1];
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
}
