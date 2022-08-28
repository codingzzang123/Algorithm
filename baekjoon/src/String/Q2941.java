package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : String
 * fileName       : Q2941
 * author         : Hosun
 * date           : 2022-08-28
 * description    : https://www.acmicpc.net/problem/2941, 크로아티아 알파벳
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-28        Hosun              최초 생성
 */
public class Q2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int bit = 0;
        String str = br.readLine();

        String sarray[] = new String[]{"c=","c-","dz=",
                "d-","lj","nj","s=","z="};

        for(int j=0; j<str.length(); j++){
            for(int i=0; i< sarray.length; i++){
                if(str.contains(sarray[i])){
                    count++;
                    int size = sarray[i].length();
                    bit += size;
                    j+=size;
                    break;
                }
            }
        }

        int result = count + (str.length()-bit);
        System.out.println(result);

    }
}
