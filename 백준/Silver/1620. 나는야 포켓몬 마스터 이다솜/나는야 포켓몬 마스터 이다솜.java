import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int N = Integer.parseInt(st.nextToken()); // 26
        int M = Integer.parseInt(st.nextToken()); // 5

        Map<String, Integer> nameToNum = new HashMap<>();
        String[] numToName = new String[N+1];
        for(int i = 0; i < N; i++) {
            String name = br.readLine().trim(); //Pikachu
            nameToNum.put(name, i+1);
            numToName[i+1] = name;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String input = br.readLine().trim();
            // 입력값이 숫자인지
            if (Character.isDigit(input.charAt(0))) {
                int num = Integer.parseInt(input);
                sb.append(numToName[num]);
            } else {
                sb.append(nameToNum.get(input));
            }
            if (i < M - 1) {
                sb.append('\n');
            }
        }
        System.out.println(sb);
    }
}