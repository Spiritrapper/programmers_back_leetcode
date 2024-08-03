import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main_팰린드롬인지확인하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int s_num = s.length();
		
		boolean is_symmetric = true;
		
		for(int i=0; i<(s_num / 2); i++) {
			if (s.charAt(i) != s.charAt(s_num -i-1)) {
				is_symmetric = false;
				break;
			}
		}
		
		if(is_symmetric) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}

		
	}
}