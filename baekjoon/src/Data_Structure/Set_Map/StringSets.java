package Data_Structure.Set_Map;

/**
 * packageName    : Data_Structure.Set_Map
 * fileName       : StringSets
 * author         : Hosun
 * date           : 2022-10-17
 * description    : 백준 - 문자열 집합
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-10-17        Hosun              최초 생성
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class StringSets {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String []args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Boolean> map_s = new HashMap<>();
        map_s = getMap(n);
        String []M = getSet(m);

        System.out.println(isContain(M,map_s));

    }
    public static Map<String, Boolean> getMap(int n)throws IOException {
        Map<String, Boolean> tmp = new HashMap<>();
        for(int i=0; i<n; i++){
            tmp.put(br.readLine(), false);
        }
        return tmp;
    }

    public static String[] getSet(int n) throws IOException {
        String []tmp = new String[n];
        for(int i=0; i<n; i++){
            tmp[i] = br.readLine();
        }
        return tmp;
    }

    public static int isContain(String []M, Map<String,Boolean> S){
        int count = 0;
        for (String m : M) {
            if(S.containsKey(m) && !S.get(m))
                count++;
        }
        return count;
    }
}