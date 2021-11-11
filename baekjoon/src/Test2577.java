import java.util.Scanner;

public class Test2577
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int[] count = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int result = a * b * c;
        String str = String.valueOf(result);
        String[] arr = str.split("");
        
        for(int i=0; i<arr.length; i++)
        {
            if(Integer.parseInt(arr[i])==0)
                count[0]++;
            else if(Integer.parseInt(arr[i])==1)
                count[1]++;
            else if(Integer.parseInt(arr[i])==2)
                count[2]++;
            else if(Integer.parseInt(arr[i])==3)
                count[3]++;
            else if(Integer.parseInt(arr[i])==4)
                count[4]++;
            else if(Integer.parseInt(arr[i])==5)
                count[5]++;
            else if(Integer.parseInt(arr[i])==6)
                count[6]++;
            else if(Integer.parseInt(arr[i])==7)
                count[7]++;
            else if(Integer.parseInt(arr[i])==8)
                count[8]++;
            else if(Integer.parseInt(arr[i])==9)
                count[9]++;
        }
        
        for(int i : count)
        {
            System.out.println(i);
        }
        
        sc.close();
        
    }
}