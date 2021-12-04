import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test1427 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		Integer[] arr = new Integer[n.length()];
		
		for(int i=0; i<n.length(); i++)
		{
			arr[i] = Integer.parseInt(n.substring(i, i+1));
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i : arr)
		{
			System.out.print(i);
		}
		
		sc.close();
	}
}
