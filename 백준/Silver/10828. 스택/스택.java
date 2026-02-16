import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        int[] stack = new int[n];
        int top = 0;

        int[] out = new int[n];
        int outIdx = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            if (str.startsWith("push")) {
                stack[top++] = Integer.parseInt(str.substring(4).trim());
            } else if (str.equals("top")) {
                out[outIdx++] = (top == 0) ? -1 : stack[top-1];
            } else if (str.equals("size")) {
                out[outIdx++] = top;
            } else if (str.equals("empty")) {
                out[outIdx++] = (top == 0) ? 1 : 0;
            } else if (str.equals("pop")) {
                out[outIdx++] = (top == 0) ? -1 : stack[--top];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < outIdx; i++) {
            sb.append(out[i]).append("\n");
        }
        System.out.println(sb);
    }
}