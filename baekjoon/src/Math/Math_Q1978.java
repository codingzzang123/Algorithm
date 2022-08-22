package Math;
/*
    Level   :   Sliver5
    Date    :   2022-08-17

    Description
    문제
    주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

    입력
    첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

    출력
    주어진 수들 중 소수의 개수를 출력한다.

    URL :   https://www.acmicpc.net/problem/1978
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.sqrt;

public class Math_Q1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        int count = 0;

        for(int i=0; i<size; i++){
            int n = Integer.parseInt(br.readLine());

            boolean flag = false;

            if(n == 1){
                continue;
            }

            for(int j = 2; j < sqrt(n); j++){
                if(n % j == 0){
                    flag = true;
                }
            }

            if(!flag)
                count++;
        }

        System.out.println(count);
    }
}
/*
* import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.sqrt;

//
public class Q1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine(); // n 쓰지 않음

        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            if (isPrime(n)) count++;
        }

        System.out.println(count);
    }

    public static boolean isPrime(int num) {
        if (num == 1) return false;

        for (int i = 2; i <= sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}*/