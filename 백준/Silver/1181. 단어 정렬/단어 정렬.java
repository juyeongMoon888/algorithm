import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine().trim());
        
        String[] strArr = new String[N];
        for (int i = 0; i < N; i++) {
            strArr[i] = br.readLine().trim();
        }
        
        Arrays.sort(strArr, (s1, s2) -> {
            if (s1.length() == s2.length()) {
                return s1.compareTo(s2);
            }
            return s1.length() - s2.length();
        });
        
        StringBuilder sb = new StringBuilder();
        String prev = "";
        for (int i = 0; i < N; i++) {
            if (strArr[i].equals(prev)) continue;
            // 갱신
            prev = strArr[i];
            // 출력
            sb.append(strArr[i]).append('\n');
        }
        System.out.print(sb);
    }
}