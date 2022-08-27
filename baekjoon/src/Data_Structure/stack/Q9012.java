package Data_Structure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * packageName    : Data_Structure.stack
 * fileName       : Q9012
 * author         : Hosun
 * date           : 2022-08-27
 * description    : https://www.acmicpc.net/problem/9012
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-27        Hosun              최초 생성
 */
public class Q9012 {
    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            builder.append(br.readLine()).append("\n");
        }

        StringTokenizer tokenizer = new StringTokenizer(builder.toString(),"\n");

        while(tokenizer.hasMoreTokens()){
            Stack<Character> stack = new Stack();
            String str = tokenizer.nextToken();

            for(int i=0; i<str.length(); i++){
                if(stack.isEmpty()) {
                    if( (Character) str.charAt(i) == ')'){
                        stack.push(str.charAt(i));
                        break;
                    }

                    stack.push(str.charAt(i));
                }
                else {
                    Character temp = stack.peek();
                    if((Character)str.charAt(i) == temp){
                        stack.push(str.charAt(i));
                    }
                    else{
                        stack.pop();
                    }
                }
            }
            if(stack.isEmpty())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

}
