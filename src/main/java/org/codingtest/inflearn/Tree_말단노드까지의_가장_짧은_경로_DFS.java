package org.codingtest.inflearn;

public class Tree_말단노드까지의_가장_짧은_경로_DFS {

    public static class Node {

        int data;
        Node lt, rt;

        public Node(int val) {
            data = val;
            lt = rt = null;
        }
    }

    Node root;

    public int dfs(int L, Node root) {

        if (root.lt == null && root.rt == null) {
            return L;
        }

        return Math.min(dfs(L + 1, root.lt), dfs(L + 1, root.rt));
    }

    public static void main(String[] args) {

        Tree_말단노드까지의_가장_짧은_경로_DFS tree = new Tree_말단노드까지의_가장_짧은_경로_DFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        System.out.println(tree.dfs(0, tree.root));
    }
}
