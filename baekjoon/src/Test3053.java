import java.util.Scanner;

public class Test3053 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextInt();
		
		System.out.printf("%.6f", r*r*Math.PI);
		System.out.println();
		System.out.printf("%.6f", r*r*2);
		
		sc.close();
	}
}
