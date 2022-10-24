package Data_Structure.binarysearch;

/**
 * packageName    : Data_Structure.binarysearch
 * fileName       : CuttingTree
 * author         : Hosun
 * date           : 2022-10-24
 * description    : 백준 2805문제 - 나무 자르기 (이진탐색 응용)
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-10-24        Hosun              최초 생성
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CuttingTree {
    private static int []arr;

    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[n];

        st = new StringTokenizer(br.readLine()," ");

        int max = 0;
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] > max)
                max = arr[i];
        }

        int min = 0;
        int mid = 0;

        while(min < max){
            mid = (min+max)/2;
            int sum = 0;

            for(int i=0; i<n; i++){
                int tmp = arr[i] - mid;
                if(tmp>0)
                    sum+=tmp;
            }
            System.out.println("1");

            if(sum < m){
                max = mid;
            }else {
                min = mid + 1;
            }
        }

        System.out.println(min);
    }
}
