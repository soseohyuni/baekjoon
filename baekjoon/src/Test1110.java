import java.util.Scanner;

public class Test1110
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int i = 0;
        
        while (true)
        {
            n = (n % 10 * 10) + ((n / 10 + n % 10)%10);
            i++;
            
            if(n==m)
                break;
        }
        
        System.out.println(i);
        
        sc.close();
    }
}