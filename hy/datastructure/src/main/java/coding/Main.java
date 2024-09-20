package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] condition = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::new).toArray();
        char[][] map = new char[condition[0]][condition[1]];
        for(int  i=0; i<condition[0]; i++){
            char[] charArray = br.readLine().toCharArray();
            for(int j=0; j<charArray.length; j++){
                map[i][j] = charArray[j];
            }
        }

        solution(map);

    }

    static class Node{
        int x;
        int y;
        int cnt;

        public Node(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
            this.cnt = 1;
        }
    }

    private static void solution(char[][] map) {
        int[] cx = new int[]{-1,1,0,0};
        int[] cy = new int[]{0,0,-1,1};

        PriorityQueue<Node> que = new PriorityQueue<>((t1,t2)->Integer.compare(t1.cnt,t2.cnt));
        boolean[][] history = new boolean[map.length][map[0].length];

        que.add(new Node(0,0));

        while(!que.isEmpty()){

            Node next = que.poll();
            if(history[next.x][next.y]) continue;
            history[next.x][next.y] = true;

            if(next.x == map.length-1 && next.y == map[0].length-1){
                System.out.println(next.cnt);
                break;
            }

            for(int i=0; i<4; i++){

                int nx = next.x + cx[i];
                int ny = next.y + cy[i];
                if(
                        (nx >=0 && nx < map.length ) &&
                                (ny >=0 && ny < map[0].length) &&
                                map[nx][ny] == '1' &&
                                !history[nx][ny] ){
                    que.add(new Node(nx,ny, next.cnt+1));

                }

            }


        }





    }
}
