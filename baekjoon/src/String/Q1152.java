package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : String
 * fileName       : Q1152
 * author         : Hosun
 * date           : 2022-08-28
 * description    : https://www.acmicpc.net/problem/1152
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-28        Hosun              최초 생성
 */
public class Q1152 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//
//        StringTokenizer st = new StringTokenizer(str," ");
//        int s = st.countTokens();
//        System.out.println(s);
        int pre = ' ';
        int count = 0;
        while(true){
            int tmp = System.in.read();
            if(tmp == '\n') {
                if(pre != ' ') {
                    count++;
                }
                break;
            }

            if(tmp == ' ' && tmp != pre){
                count++;
            }
            pre = tmp;
        }
        System.out.println(count);
    }
}
