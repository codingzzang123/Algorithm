package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : BruteForce
 * fileName       : Q2798
 * author         : Hosun
 * date           : 2022-08-29
 * description    : https://www.acmicpc.net/problem/2798
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-29        Hosun              최초 생성
 */
public class Q2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int cards[] = new int[N];

        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int result = search(cards,N,M);
        System.out.println(result);
    }
    static int search(int arr[], int n, int m){
        int max=-1;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    int tmp = arr[i]+arr[j]+arr[k];

                    if(tmp == m)
                        return tmp;

                    if(tmp > max && tmp < m)
                        max = tmp;
                }
            }
        }
        return max;
    }
}
