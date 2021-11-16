import java.util.*;

public class Test1152 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine().trim();
		String[] arr = s.split(" ");
        
		if (s.isEmpty()) 
			System.out.println(0);
		else
            System.out.println(arr.length);
		
		sc.close();
	}

}
