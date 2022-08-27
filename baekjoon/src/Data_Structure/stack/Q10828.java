package Data_Structure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * packageName    : Data_Structure
 * fileName       : Stack_Q10828
 * author         : Hosun
 * date           : 2022-08-24
 * description    : https://www.acmicpc.net/problem/10828
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-24        Hosun              최초 생성
 */
public class Q10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            String temp = br.readLine();

            if(temp.contains("push")){
                StringTokenizer tokenizer = new StringTokenizer(temp," ");
                tokenizer.nextToken();
                stack.push(Integer.parseInt(tokenizer.nextToken()));
            }else if (temp.equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if (temp.equals("empty")) {
                if(stack.isEmpty())
                    sb.append(1).append("\n");
                else
                    sb.append(0).append("\n");
            }else{
                if(stack.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    if(temp.equals("pop")){
                        sb.append(stack.pop()).append("\n");
                    }
                    if(temp.equals("top")){
                        sb.append(stack.peek()).append("\n");
                    }
                }
            }
        }

        System.out.println(sb.toString());
    }
}

/*
    // sout을 하는 것 보다 StringBulider이용해서 하는 것이 더 빠르다.
        for(int i=0; i<n; i++){
            String temp = br.readLine();

            if(temp.contains("push")){
                StringTokenizer tokenizer = new StringTokenizer(temp," ");
                tokenizer.nextToken();
                stack.push(Integer.parseInt(tokenizer.nextToken()));
            }else if (temp.equals("size")) {
                System.out.println(stack.size());
            } else if (temp.equals("empty")) {
                if(stack.isEmpty())
                    System.out.println(1);
                else
                    System.out.println(0);
            }else{
                if(stack.isEmpty()){
                    System.out.println(-1);
                }else{
                    if(temp.equals("pop")){
                        System.out.println(stack.pop());
                    }
                    if(temp.equals("top")){
                        System.out.println(stack.peek());
                    }
                }
            }
        }
*/