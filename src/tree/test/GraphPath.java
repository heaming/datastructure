package tree.test;
// p.561 13.3.1 두 노드 사이의 경로

import java.util.LinkedList;
import java.util.Queue;

public class GraphPath {

    static boolean isPath(int from, int to, boolean[] visited, int[][] graph) {

        Queue<Integer> que = new LinkedList<>();
        que.add(from);
        visited[from] = true;

        while(!que.isEmpty()) {
            int cur = que.poll();

//            for(int i = 0; i < graph.length; i++) {
//                if(!visited[i] && )
//
//
//
//            }



        }

        return true;
    }

    public static void main(String[] args) {

    }
}
