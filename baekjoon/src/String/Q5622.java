package String;

import java.io.IOException;

/**
 * packageName    : String
 * fileName       : Q5622
 * author         : Hosun
 * date           : 2022-08-28
 * description    : https://www.acmicpc.net/problem/5622, 다이얼
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-28        Hosun              최초 생성
 */
public class Q5622 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        int input;

        while(true){
            input = System.in.read();

            if(input == '\n') break;

            if(input < 68) count+=3;
            else if(input < 71) count += 4;
            else if(input < 74) count += 5;
            else if(input < 77) count += 6;
            else if(input < 80) count += 7;
            else if(input < 84) count += 8;
            else if(input < 87) count += 9;
            else count += 10;
        }

        System.out.println(count);
    }
}
