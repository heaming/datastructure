package tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTree<T> {

    private class Node {
        /* 코드의 각 Node는 데이터, 다른 2개의 Node 요소에 대한 참조 포함
         * left, right는 현재 Node의 자식
         */

        private Node left;
        private Node right;

        private final T element;

        public Node(T element) {
            this.element = element;
            this.left = null;
            this.right = null;
        }

        public Node(Node left, Node right, T element) {
            this.element = element;
            this.left = left;
            this.right = right;
        }

    }

    /* BFS
     * 1. 처음 큐에는 루트 노드만 포함
     * 2. 큐에서 첫번째 노드를 현재 노드로 pop
     * 3. 현재 노드에 왼쪽 노드가 있는 경우 해당 왼쪽 노드를 큐에 추가
     * 4. 현재 노드에 오른쪽 노드가 있는 경우 해당 오른쪽 노드를 큐에 추가
     * 5. 큐가 비워질 때까지 반복
     */
    private void bfs(Node node) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);

        while(!queue.isEmpty()) {
            Node cur = queue.poll();

            System.out.println(cur);

            if(cur.left != null) {
                queue.add(cur.left);
            }

            if(cur.right != null) {
                queue.add(cur.right);
            }
        }
    }


    /* DFS
     * 전위 순회 : 현재 -> 왼쪽 하위 -> 오른쪽 하위
     * 중위 순회 : 왼쪽 하위 -> 현재 -> 오른쪽 하위
     * 후위 순회 : 왼쪽 하위 -> 오른쪽 하위 -> 현재
     */
    private void dfsPreOrder(Node node) {
        if(node != null) {
            System.out.println(node);
            dfsPreOrder(node.left);
            dfsPreOrder(node.right);
        }
    }

    private void dfsInOrder(Node node) {
        if(node != null) {
            dfsInOrder(node.left);
            System.out.println(node);
            dfsInOrder(node.right);
        }
    }

    private void dfsPostOrder(Node node) {
        if(node != null) {
            dfsPostOrder(node.left);
            dfsPostOrder(node.right);
            System.out.println(node);
        }
    }


    /* 이진 힙 - 상향식 힙화 알고리즘
    * 1. 힙의 끝을 cur로 설정
    * 2-1. cur의 부모 < cur : 노드 교환
    * 2-2. cur의 부모 > cur : stop
    * */

    /* 이진 힙 - 하향식 힙화 알고리즘
     * 1. 힙의 루트를 cur로 설정
     * 2-1. cur의 가장 큰 자식 > cur : 노드 교환
     * 2-2. cur의 자식 < cur : stop
     * */


}
