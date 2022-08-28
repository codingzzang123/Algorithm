package Data_Structure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * packageName    : Data_Structure.queue
 * fileName       : Q11866
 * author         : Hosun
 * date           : 2022-08-28
 * description    : https://www.acmicpc.net/problem/11866
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-28        Hosun              최초 생성
 */
public class Q11866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(tokenizer.nextToken());
        int K = Integer.parseInt(tokenizer.nextToken());
        int result[] = new int[N];
        LinkedList<Integer> q = new LinkedList<>();

        StringBuilder builder = new StringBuilder();

        for(int i=0; i<N; i++){
            q.add(i+1);
        }
        int size = 0;
        while(!q.isEmpty()){
            int index = K;
            for(int i=0; i<index; i++){
                if(i==index-1){
                    result[size]=q.pop();
                }else{
                    int temp = q.pop();
                    q.offer(temp);
                }
            }
            size++;
        }

        builder.append('<');
        for(int i=0; i<result.length; i++){
            if(i != result.length-1){
                builder.append(result[i]+", ");
                continue;
            }
            builder.append(result[i]);
        }
        builder.append('>');

        System.out.println(builder);
    }
}
