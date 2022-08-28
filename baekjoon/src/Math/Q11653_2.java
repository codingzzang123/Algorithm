package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * packageName    : Math
 * fileName       : Q11653
 * author         : Hosun
 * date           : 2022-08-29
 * description    : https://www.acmicpc.net/problem/11653, 소인수 분해
                    Math.sqrt() 사용해서 런타임 감소 시키기!!
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-29        Hosun              최초 생성
 */
public class Q11653_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=2; i<=Math.sqrt(N); i++){
            while(N % i == 0){
                System.out.println(i);
                N /= i;
            }
        }
        if(N != 1){
            System.out.println(N);
        }
    }
}
