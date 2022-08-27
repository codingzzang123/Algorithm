package Data_Structure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : Data_Structure.queue
 * fileName       : Q18258
 * author         : Hosun
 * date           : 2022-08-27
 * description    : https://www.acmicpc.net/problem/18258
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-27        Hosun              최초 생성
 */
public class Q18258 {
//    static List<Integer> queue = new ArrayList<>();
    static StringBuilder builder = new StringBuilder();
    static int[] queue;
    static int size = 0;
    static int front = 0;
    static int back = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        queue = new int[N];

        for(int i=0; i<N; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine()," ");
            String inputString = tokenizer.nextToken();

            switch (inputString){
                case "push" : push(Integer.parseInt(tokenizer.nextToken())); break;
                case "size" : size(); break;
                case "pop" : pop(); break;
                case "empty" : empty(); break;
                case "front" : front(); break;
                case "back" : back(); break;
            }
        }

        System.out.println(builder);
    }

    static void push(int i){
        queue[back] = i;
        size++;
        back++;
    }

    static void pop(){
        int result=-1;
        if(size != 0){

            result = queue[front];
            size--;
            front++;

        }
        builder.append(result).append("\n");
    }

    static void size(){
         builder.append(size).append("\n");
    }

    static void empty(){
        if(size == 0)
            builder.append(1).append("\n");
        else
            builder.append(0).append("\n");
    }

    static void front(){
        if(size == 0)
            builder.append(-1).append("\n");
        else
            builder.append(queue[front]).append("\n");
    }

    static void back(){
        if(size == 0)
            builder.append(-1).append("\n");
        else
            builder.append(queue[back-1]).append("\n");
    }

}
