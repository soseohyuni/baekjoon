import java.util.Arrays;
import java.util.Scanner;

public class Test1316 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // �Է� �� ���ڿ��� ����
        int cnt = 0; // �׷� �ܾ��� �� 
        
        String alph[] = new String[n]; // n���� ���ڿ� �迭 ����
        boolean alph_check[] = new boolean[26]; // ���ĺ��� ����� ���θ� �Ǵ��� ����
        
        for(int i=0; i<n; i++) // �ܾ� �Է�
        { 
        	alph[i] = sc.next();
        }
        
        for(int i=0; i<alph.length; i++) // ���ڿ� �迭 Ž�� 
        {       	
            cnt++; // �׷� �ܾ��� �����Ͽ� +1 ��Ų �� �Ǵ��Ѵ�.
            Arrays.fill(alph_check, false); // �ܾ�� ���ĺ� ����� ���θ� �Ǵ��� �迭�� �ʱ�ȭ          
            
            for(int j=0; j<alph[i].length(); j++) // �� �ܾ Ž��
            { 
            	// �ܾ��� ������ ���ڰ� �ƴϸ� && �������� �ʾҴ� ���ĺ��̸� && ���� ���ĺ��� ��ġ���� ������
            	if(j!=alph[i].length()-1 && alph_check[alph[i].charAt(j)-97] == false && alph[i].charAt(j) != alph[i].charAt(j+1))
            		alph_check[alph[i].charAt(j)-97] = true; // �ش� ���ĺ��� �׷��� ���̹Ƿ� true�� üũ�� �� �Ѿ��.
            	else if(alph_check[alph[i].charAt(j)-97] == true) // �̹� �� �� �����ߴ� ���ĺ��̶��,
            	{ 
            		cnt-=1; // �׷� �ܾ��� ������ �ı��ϰ� -1 �� 
            		break; // Ž������            		
            	}
            }
        }
        
        System.out.println(cnt); // �׷� �ܾ��� �� ���
        
        sc.close();
	}
}
