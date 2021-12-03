import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test10989 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// Collections.sort()는 메모리 초과
		Arrays.sort(arr);
		
		for(int i=0; i<n; i++)
		{
			sb.append(arr[i]).append('\n');
		}
		
		System.out.println(sb);
		
		br.close();
		
	}
}
