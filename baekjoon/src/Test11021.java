import java.util.Scanner;

public class Test11021
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a+b;
            
            System.out.printf("Case #%d: " + sum + "\n", i);
        }
        sc.close();
    }
}
