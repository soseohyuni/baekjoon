import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test18870 
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] nums = new int[n];
        
        for(int i=0; i<n; i++)
            nums[i] = Integer.parseInt(input[i]);

        int[] sortNums = nums.clone();
        Arrays.sort(sortNums);

        // Map<ÁÂÇ¥°ª, ÁÂÇ¥°ªÀÇ ÃÖ¼Ò ÀÎµ¦½º>
        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for(int i : sortNums)
            if (!map.containsKey(i))
                map.put(i, idx++);

        StringBuilder sb = new StringBuilder();
        
        for(int i : nums)
            sb.append(map.get(i)).append(' ');

        System.out.println(sb.toString());
        
        br.close();
	}
}
