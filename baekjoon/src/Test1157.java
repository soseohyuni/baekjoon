import java.util.Arrays;
import java.util.Scanner;

public class Test1157 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String[] strArr = new String[str.length()];
		
		int n = 65;
		int[] cnt = new int[26];
		int max = 0;
		int temp = 0;
		
		for(int i=0; i<str.length(); i++)
		{
			 strArr[i] = str.substring(i, i+1);
			 
			 for(int j=0; j<26; j++)
			 {
				 if(String.valueOf((char)(n+j)).equals(strArr[i]))
					 ++cnt[j];
				 else if(String.valueOf((char)(n+j+32)).equals(strArr[i]))
					 ++cnt[j];
			 }
		}
		
		sc.close();
		
		for(int i=1; i<cnt.length; i++)
		{
			if(cnt[max]<cnt[i])
			{
				max = i;
				temp = i;
			}
		}
		
		Arrays.sort(cnt);
		
		if(cnt[25]==cnt[24])
			System.out.println("?");
		else
			System.out.println((char)(max+n));
//		
//		for(int i : cnt)
//		{
//			System.out.println(i);
//		}
//		
	}
}
