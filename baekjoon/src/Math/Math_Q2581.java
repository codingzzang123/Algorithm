package Math;

/*
    Level   :   Sliver5
    Date    :   2022-08-17

    Description
    문제
    자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.

    예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.

    입력
    입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.

    M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.

    출력
    M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다.

    단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.

    URL :   https://www.acmicpc.net/problem/2581
* */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math_Q2581 {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int M = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());

            int sum = 0;
            int min = 0;

            boolean b[] = new boolean[N+1];

            b[0] = b[1] = true;

            for(int i = 2; i<=N; i++){
                if(!b[i]){
                    for(int j = i*i; j<=N; j+=i){
                        b[j] = true;
                    }
                }
            }

            for(int i = M; i<=N; i++){
                if(!b[i]){
                    sum += i;
                    if(min == 0){
                        min = i;
                    }
                }
            }

            if(sum == 0) {
                System.out.println(-1);
            }else {
                System.out.println(sum + "\n" + min);
            }
        }
}
