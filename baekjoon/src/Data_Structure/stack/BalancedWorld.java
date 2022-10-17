package Data_Structure.stack;

/**
 * packageName    : Data_Structure.stack
 * fileName       : BalancedWorld
 * author         : Hosun
 * date           : 2022-10-17
 * description    : 백준 - 균형잡힌 세상
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-10-17        Hosun              최초 생성
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalancedWorld {

    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;

        while (true){
            s = br.readLine();
            if(s.equals("."))
                break;

            sb.append(balanceString(s)).append("\n");

        }
        System.out.println(sb);
    }

    public static String balanceString(String str){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char tmp = str.charAt(i);

            if(tmp == '(' || tmp == '['){
                stack.push(tmp);
            }
            else if(tmp == ')'){
                if(stack.isEmpty() || stack.peek() != '(')
                    return "no";
                else
                    stack.pop();
            }
            else if(tmp == ']'){
                if(stack.isEmpty() || stack.peek() != '[')
                    return "no";
                else
                    stack.pop();
            }
        }
        if(stack.isEmpty())
            return "yes";
        else
            return "no";
    }
}