import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        int[] queue = new int[n]; // 큐 배열
        int head = 0; // 꺼낼 위치
        int tail = 0; // 다음 push 위치(다음에 넣을 빈자리)
        int size = 0; //현재 원소가 몇개 들어있는지 판단

        int[] out = new int[n];
        int outIdx = 0;

        for (int i = 0; i < n; i++) {
            String order = br.readLine().trim();

            if (order.startsWith("push")) {
                queue[tail] = Integer.parseInt(order.substring(4).trim());
                tail = (tail + 1) % n;
                size++;

            } else if (order.equals("front")) {
                //큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                out[outIdx++] = (size == 0) ? -1 : queue[head];
            } else if (order.equals("back")) {
                //큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                out[outIdx++] = (size == 0) ? -1 : queue[(tail - 1 + n) % n];
            } else if (order.equals("size")) {
                //큐에 들어있는 정수의 개수 출력
                out[outIdx++] = size;
            } else if (order.equals("empty")) {
                //큐가 비어있으면 1, 아니면 0을 출력한다.
                out[outIdx++] = (size == 0) ? 1 : 0;
            } else if (order.equals("pop")) {
                // 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                out[outIdx++] = (size == 0) ? -1 : queue[head];
                if (size > 0) {
                    head = (head + 1) % n; // 나머지 // head 이동
                    size--;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < outIdx; i ++) {
            sb.append(out[i]).append("\n");
        }

        System.out.println(sb);
    }
}