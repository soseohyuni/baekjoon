import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Test2751 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++)
		{
			list.add(Integer.parseInt(br.readLine()));
		}
		
		// Arrays.sort()는 시간 초과
		Collections.sort(list);
		
		for(int i : list)
		{
			sb.append(i).append('\n');
		}
		
		System.out.println(sb);
		
		br.close();
		
		/* 시간복잡도 : O(n) => 매우 빠른 방법
		boolean[] arr = new boolean[2000001];	
        
		int N = Integer.parseInt(br.readLine());
        
		for(int i = 0; i < N; i++) {
			arr[Integer.parseInt(br.readLine()) + 1000000] = true;
		}
 
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]) {
				sb.append((i - 1000000)).append('\n');
			}
		}
		System.out.print(sb); 
		*/
	}
}
