package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : String
 * fileName       : Q2908
 * author         : Hosun
 * date           : 2022-08-28
 * description    : https://www.acmicpc.net/problem/2908
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-28        Hosun              최초 생성
 */
public class Q2908 {
    static final int bit = 3;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        String x = st.nextToken();
        String y = st.nextToken();

        String x2="",y2="";
        for(int i=bit-1; i>=0; i--){
            x2 += x.charAt(i);
            y2 += y.charAt(i);
        }
        String result =  Integer.parseInt(x2) > Integer.parseInt(y2) ?
                x2 : y2;
        System.out.println(result);
    }
}
