import java.util.Scanner;

public class Test2675 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int cnt = 0;
		String str= "";
		String result = "";
		String[] arr;
		
		for(int i=0; i<num; i++)
		{
			cnt = sc.nextInt();
			str = sc.next();
			
			arr = new String[str.length()];
			
			for(int j=0; j<str.length(); j++)
			{
				arr[j] = str.substring(j, j+1);
				
				for(int k=0; k<cnt; k++)
				{
					result += arr[j];
				}
			}
			
			result += "\n";
		}
		
		sc.close();
		
		System.out.println(result);
	}

}
