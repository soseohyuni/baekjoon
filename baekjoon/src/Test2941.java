import java.util.Scanner;

public class Test2941 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String[] str = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i=0; i<str.length; i++)
		{
			if(s.contains(str[i]))
				s = s.replace(str[i], "?");
		}
		
		sc.close();
		
		System.out.println(s.length());
	}
}
