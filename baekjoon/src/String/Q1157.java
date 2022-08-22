package String;

/* bronze1
* 2022-08-10
*
문제
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
*
*  https://www.acmicpc.net/problem/1157
* */

import java.util.Scanner;

public class Q1157 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[26];
        String s = in.next();

        for (int i = 0; i < s.length(); i++){
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                arr[s.charAt(i) - 'A']++;
            }
            else {
                arr[s.charAt(i) - 'a']++;
            }
        }
        int max = -1;
        char ch='.';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char)(i + 65);
            }
            else if (arr[i] == max) {
                ch = '?';
            }
        }

        System.out.print(ch);

    }

}