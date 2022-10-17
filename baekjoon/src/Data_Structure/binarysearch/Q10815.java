package Data_Structure.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * packageName    : Data_Structure.binarysearch
 * fileName       : Q10815
 * author         : Hosun
 * date           : 2022-10-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-10-11        Hosun              최초 생성
 */
public class Q10815 {
    static int n, m;
    static int arr[]; //arr 배열에 이진 탐색 적용해서 찾을 것임.
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        } //2번째줄 카드를 표현하는 배열 (아직 정렬 x )

        Arrays.sort(arr); // 이진 탐색을 위한 정렬

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            int number = Integer.parseInt(st.nextToken());

            if(isEqual(number))
                System.out.print("1 ");
            else
                System.out.print("0 ");
        }
    }
    //arr = { 4, 5, 71 ,34 , 23, 12 } left = 0 , right = 5;
    //(int) (left + right) / 2 => 2
    public static boolean isEqual(int number){
        int left = 0; //왼쪽 끝
        int right = n-1; //오른쪽 끝

        while (left <= right){
            int midIndex = (left+right)/2;
            int mid = arr[midIndex];

            if(number == mid)
                return true;
            else if(number > mid)
                left = midIndex+1;
            else
                right = midIndex - 1;
        }
        return false;
    }
}
