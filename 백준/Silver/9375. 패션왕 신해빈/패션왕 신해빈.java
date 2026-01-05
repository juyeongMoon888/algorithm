import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int test = Integer.parseInt(br.readLine().trim()); // 2
        
        for (int i = 0; i < test; i++) {
            int N = Integer.parseInt(br.readLine().trim()); // 3
            Map<String, Integer> closet = new HashMap<>();
            
            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine().trim());
                
                st.nextToken();
                String category = st.nextToken();
                
                closet.put(category, closet.getOrDefault(category, 0) + 1);
           
            }
            
                int result = 1;
                for (int count : closet.values()) {
                    result = result * (count + 1);
                }
                
                System.out.println(result - 1);
        }
    }
}