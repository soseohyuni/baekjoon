import java.util.Scanner;

public class Test10773 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		int[] arr = new int[K];
		int zero = 0;
		int tot = 0;
		String str = "";
		
		for(int i=0; i<K; i++)
		{
			arr[i] = sc.nextInt();
			
			if(arr[i]!=0)
				str = arr[i] + " ";
			else	
				zero++;
		}
		
		String res[] = str.split(" ");
		
		for(int i=0; i<res.length-zero; i++)
		{
			tot += Integer.parseInt(res[i]);
		}

		System.out.println(tot);
		
		sc.close();
	}
}
