import java.util.Scanner;

public class Test2908 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		String[] arrA = new String[3];
		String[] arrB = new String[3];
		
		for(int i=0; i<3; i++)
		{
			arrA[i] = a.substring(i, i+1);
			arrB[i] = b.substring(i, i+1);
		}
		
		a = "";
		b = "";
		
		for(int i=2; i>=0; i--)
		{
			a += arrA[i];
			b += arrB[i];
		}
		
		if(Integer.parseInt(a)>Integer.parseInt(b))
			System.out.println(a);
		else
			System.out.println(b);
		
		sc.close();
	}
}
