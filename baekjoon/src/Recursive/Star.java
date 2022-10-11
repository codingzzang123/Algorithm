package Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star {
    static  StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                printStart(i,j);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    static void printStart(int x, int y){
        if(x<3 && y<3){
            if(x%3 == 1 && y%3 == 1){
                sb.append(" ");
            }else{
                sb.append("*");
            }
        }else {
            if(x%3 == 1 && y%3 == 1){
                sb.append(" ");
            }
            else{
                printStart(x/3,y/3);
            }
        }
    }
}
