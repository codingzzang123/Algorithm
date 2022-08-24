package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : BruteForce
 * fileName       : Q7568
 * author         : Hosun
 * date           : 2022-08-24
 * description    : https://www.acmicpc.net/problem/7568
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-24        Hosun              최초 생성
 */

public class Q7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] weight = new int[n];
        int[] height = new int[n];
        int[] result = new int[n];

        for(int i=0; i<n; i++){
            String str = br.readLine();
            StringTokenizer tokenizer = new StringTokenizer(str," ");
            weight[i] = Integer.parseInt(tokenizer.nextToken());
            height[i] = Integer.parseInt(tokenizer.nextToken());
        }

        for(int i=0; i<n; i++){
            int k = 1;
            for(int j=0; j<n; j++){
                if(i == j)continue;

                if(weight[i] < weight[j] && height[i] < height[j]){
                    k++;
                }
            }
            result[i] = k;
        }

        for(int i : result){
            System.out.print(i+" ");
        }
    }
}
