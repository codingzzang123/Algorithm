package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : String
 * fileName       : Q1316
 * author         : Hosun
 * date           : 2022-08-28
 * description    : https://www.acmicpc.net/problem/1316
                Character 비교할때 == 말고 compareTo() 메소드 써봤음.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-28        Hosun              최초 생성
 */
public class Q1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i=0; i<N; i++){
            String word = br.readLine();
            if(checker(word))
                result++;
        }
        System.out.println(result);
    }

    static boolean checker(String str){
        int size = str.length();
        boolean flag[] = new boolean[26];

        for(int i=0; i<size; i++){
            Character tmp = str.charAt(i);
            if(i !=0){
                if(tmp.compareTo(str.charAt(i-1)) != 0 && flag[tmp - 'a'] == true)
                    return false;
                else{
                    flag[tmp - 'a'] = true;
                }
            }else
                flag[tmp - 'a'] = true;

        }
        return true;
    }
}
