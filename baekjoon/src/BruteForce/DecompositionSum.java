package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecompositionSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i=0; i<N; i++){
            int tmp = i;
            int sum = 0;

            while(tmp != 0){
                sum += tmp % 10;
                tmp /= 10;
            }
            if(sum+i == N){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
