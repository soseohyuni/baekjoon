import java.util.Scanner;

public class Test1181 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] arr = new String[n];
		String temp = "";
		
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.next();
		}
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				// 길이가 짧은 것부터 정렬
				if(arr[i].length()>arr[j].length())
				{
					temp = arr[i];
					arr[i] = arr[j]; 
					arr[j] = temp;
				}
			}
		}
	
		int k = 0;
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(arr[i].length()==arr[j].length())
				{
					while()
						
					// 길이가 같으면 사전 순으로 정렬
					if(arr[i].charAt(k)>arr[j].charAt(k))
					{
						temp = arr[j];
						arr[j] = arr[i]; 
						arr[i] = temp;
					}
					else if(arr[i].charAt(k+1)==arr[j].charAt(k+1))
					{
						
					}
				}
			}
		}
		
		for(String i : arr)
		{
			System.out.println(i);
		}
		
		sc.close();
	}
}
