package Data_Structure.binarysearch;

/**
 * packageName    : Data_Structure.binarysearch
 * fileName       : Q1920
 * author         : Hosun
 * date           : 2022-10-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-10-13        Hosun              최초 생성
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*
 * N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
 * //binary-search
 * */
public class Q1920 {


    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String []args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        int []arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<m; i++){
            int left = 0;
            int right = n-1;

            int tmp = Integer.parseInt(st.nextToken());
            boolean flag = false;

            while(left <= right){
                int midIndex = (left+right)/2;
                int mid = arr[midIndex];

                if(tmp == mid) {
                    flag = true;
                    System.out.println(1);
                    break;
                }else if(tmp < mid){
                    right = midIndex - 1;
                }else {
                    left = midIndex + 1;
                }
            }
            if(flag)
                continue;
            else
                System.out.println(0);
        }
    }

}
