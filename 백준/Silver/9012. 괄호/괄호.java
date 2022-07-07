import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String S = br.readLine();
			
			
			Stack<Character> stack = new Stack<Character>();
			
			for(int j = 0; j < S.length(); j++) {
				if(S.charAt(j) == '(') {
					stack.push(S.charAt(j));
				}else {

					if(stack.empty()) {
						stack.push(S.charAt(j));
						break;
					}else {
						stack.pop();
					}
				}
			}
			if(stack.empty()) System.out.println("YES");
			else System.out.println("NO");
		}
	}

}