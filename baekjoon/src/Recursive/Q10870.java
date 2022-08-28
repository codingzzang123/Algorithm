package Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : Recursive
 * fileName       : Q10870
 * author         : Hosun
 * date           : 2022-08-29
 * description    : https://www.acmicpc.net/problem/10870
                    너무 쉬운 문제....ㅋㅋㅋㅋ
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-29        Hosun              최초 생성
 */
public class Q10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(n));
    }

    static int fibonacci(int i){
        if(i<2)return i;

        return fibonacci(i-1)+fibonacci(i-2);
    }
}
