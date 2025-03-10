package org.codingtest.inflearn;

import java.util.LinkedList;
import java.util.Queue;

public class 이진트리_레벨탐색 {

    static class Node {

        private int data;
        private Node lt, rt;

        public Node(int val) {
            data = val;
            lt = rt = null;
        }
    }

    private Node root;

    public void bfs(Node root) {

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int l = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            System.out.print(l + " : ");
            for (int i = 0; i < len; i++) {
                Node cur = queue.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) {
                    queue.offer(cur.lt);
                }
                if (cur.rt != null) {
                    queue.offer(cur.rt);
                }
            }
            l++;
            System.out.println();
        }
    }

    public static void main(String[] args) {

        이진트리_레벨탐색 tree = new 이진트리_레벨탐색();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.bfs(tree.root);
    }
}
