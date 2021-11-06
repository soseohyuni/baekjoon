import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Test15552 
{
    public static void main(String [] args) throws IOException
    { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine().trim());
        
        for(int i=0; i<n; i++) 
        {
            String input = br.readLine();
            String[] ab = input.split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            bw.write((a+b) + "\n");
        }
       
        bw.flush();
        br.close();
        bw.close();
    }
}