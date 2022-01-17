import java.util.Arrays;
import java.util.Scanner;

public class Test2981 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int gcdVal = arr[1] - arr[0];
		 
		for(int i=2; i<N; i++) 
		{
			// 직전의 최대 공약수와 다음 수(arr[i] - arr[i - 1])의 최대공약수를 갱신 
			gcdVal = gcd(gcdVal, arr[i] - arr[i - 1]);
		}
 
		// 최대공약수의 약수들 찾기
		for(int i=2; i<=gcdVal; i++) 
		{
			if(gcdVal%i == 0) 
				System.out.print(i + " ");
		}
		
		sc.close();
	}
	
	// 최대공약수 함수
	static int gcd(int a, int b) 
	{
		while(b != 0) 
		{
			int r = a % b;
			a = b;
			b = r;
		}
		
		return a;
	}
}
