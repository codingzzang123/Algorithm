package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuperMario {
    static final int max = 100;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int mushroom[] = new int[10];
        int sum = 0;

        for(int i=0; i< mushroom.length; i++){
            mushroom[i] = Integer.parseInt(br.readLine());
        }

        int loop = 0;
        while(loop++ < 10){
            int tmp = sum;
            sum += mushroom[loop-1];

            if(Math.abs(max - tmp) == Math.abs(max - sum)){
                break;
            }

            if(sum >= max){
                if(Math.abs(max - tmp) > Math.abs(max - sum)){
                    break;
                }else{
                    sum = tmp;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
