import java.util.Arrays;
import java.util.Scanner;

public class Test11399 	
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		int time = 0;
		
		for(int i=0; i<N; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++)
		{
			time += arr[i]*N;
			N--;
		}
		
		System.out.println(time);
		
		sc.close();
	}
}
