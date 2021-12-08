import java.util.Scanner;
import java.util.Arrays;
 
public class Test11650
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int[][] arr = new int[n][2];
		
		for(int i=0; i<n; i++) 
		{
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		// 람다식
		Arrays.sort(arr, (e1, e2) -> 
		{
			// 첫번째 원소가 같다면 두 번째 원소끼리 비교
			if(e1[0] == e2[0])
				return e1[1] - e2[1];
			else
				return e1[0] - e2[0];
		});
		
		/*
		Arrays.sort(arr, new Comparator<int[]>() 
		{		
			@Override
			public int compare(int[] e1, int[] e2) 
			{
				if(e1[0] == e2[0])		
					return e1[1] - e2[1];
				else 
					return e1[0] - e2[0];
			}
		});
		*/
		
		for(int i=0; i<n; i++) 
		{
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
		
		sc.close();
	}
}