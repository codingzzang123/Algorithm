package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : Math
 * fileName       : Q9020
 * author         : Hosun
 * date           : 2022-08-29
 * description    : https://www.acmicpc.net/problem/9020 , 골드바흐의 추측
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-289       Hosun              최초 생성
 */
public class Q9020 {
    static boolean number[];
    public static void main(String[] args) throws IOException {
        primeNumber();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder st = new StringBuilder();

        while (T-- >0){
            int n = Integer.parseInt(br.readLine());
            int x = n/2;
            int y = n/2;

            while(true){
                if( !number[x] && !number[y]){
                    st.append(x).append(" ").append(y).append("\n");
                    break;
                }
                x--;
                y++;
            }
        }
        System.out.println(st);
    }

    public static void primeNumber(){
        number = new boolean[10001];
        number[0] = number[1] = true;
        int size = number.length;
        for(int i=2; i<Math.sqrt(size); i++){
            if(!number[i]){
                for(int j=i*i; j<size; j+=i){
                    number[j] = true;
                }
            }
        }
    }
}
