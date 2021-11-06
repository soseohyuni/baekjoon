import java.util.Scanner;

public class Test2438
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String stars = "";
        
        for(int i=0; i<n; i++)
        {
            stars += "*";
            System.out.println(stars);
        }
        
        sc.close();
    }
}