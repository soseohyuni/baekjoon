import java.util.Scanner;

public class Test10951
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextInt())
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a<0 || a>10)
                break;
            else if(b<0 || b>10)
                break;
            
            System.out.println(a+b);
        }
        
        sc.close();
    }
}