import java.util.Scanner;

// 그리디 알고리즘, 탐욕 알고리즘, 근사 알고리즘
public class Test11047 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 동전 종류 개수
		int K = sc.nextInt();	// 가치의 합
		int[] arr = new int[N];	// 동전 종류
		int min = 0;			// 최솟값
		
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
