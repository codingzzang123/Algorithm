package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : Math
 * fileName       : Q11653
 * author         : Hosun
 * date           : 2022-08-29
 * description    : https://www.acmicpc.net/problem/11653, 소인수 분해
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-29        Hosun              최초 생성
 */
public class Q11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String str = "";
        while(N!=1){
            for(int i=2; i<=N; i++){
                if(N % i == 0){
                    str+=i+" ";
                    N = N/i;
                    break;
                }
            }
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str," ");
        while(stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
