package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : String
 * fileName       : Q10809
 * author         : Hosun
 * date           : 2022-08-28
 * description    : https://www.acmicpc.net/problem/10809
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-28        Hosun              최초 생성
 */
public class Q10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int index[] = new int[26];

        for(Character j = 'a'; j<='z'; j++){
            index[j - 'a'] = -1;
            for(int i=0; i<S.length(); i++){
                if(S.charAt(i) == j && index[j-'a'] == -1)
                    index[j-'a'] = i;
            }
        }

        for(Integer i : index){
            System.out.print(i+" ");
        }

    }
}
