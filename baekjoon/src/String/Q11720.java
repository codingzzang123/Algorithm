package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : String
 * fileName       : Q11720
 * author         : Hosun
 * date           : 2022-08-28
 * description    : https://www.acmicpc.net/problem/11720
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-28        Hosun              최초 생성
 */
public class Q11720 {
    static int sum = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        getSum(br.readLine(),N);
        System.out.println(sum);
    }
    static void getSum(String str,int m){
        for(int i=0; i<m; i++){
            sum += Character.getNumericValue(str.charAt(i));
            sum += str.charAt(i) - '0';
        }
    }
}
