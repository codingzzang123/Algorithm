package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : BruteForce
 * fileName       : Q2851
 * author         : Hosun
 * date           : 2022-08-30
 * description    : https://www.acmicpc.net/problem/2851, 슈퍼마리오.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-30        Hosun              최초 생성
 */
public class Q2851 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        int mario[] = new int[10];
        for(int i=0; i<mario.length; i++)
            mario[i] = Integer.parseInt(br.readLine());

        for(int i=0; i<mario.length; i++){
            int tmp = sum;
            sum += mario[i];


            if(sum >= 100){
                if(Math.abs(100-tmp) == Math.abs(100-sum)){
                    System.out.println(sum);
                    break;
                }else{
                    int result = Math.abs(100-tmp) > Math.abs(100-sum) ?
                            sum : tmp;
                    System.out.println(result);
                    break;
                }
            }
        }


    }
}
