package Recursive;
/**
 * packageName    : Recursive
 * fileName       : Q10872
 * author         : Hosun
 * date           : 2022-08-29
 * description    : https://www.acmicpc.net/problem/10872,
                    너무 쉬운 문제....ㅋㅋㅋㅋ
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-29        Hosun              최초 생성
 */
import java.util.Scanner;

public class Q10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println(fact(N));
    }
    static int fact(int n){
        if(n<2) return 1;
        return n*fact(n-1);
    }
}
