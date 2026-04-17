package org.codingtest.loopers_coding_test_challenge_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class baekjoon_25758 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            String gene = st.nextToken();

            if (map.get(gene) != null && map.get(gene) >= 2) {
                continue;
            }
            map.put(gene, map.getOrDefault(gene, 0) + 1);
            set.add(gene);
        }

        TreeSet<Character> geneSet = new TreeSet<>();
        for (String key : map.keySet()) {
            int value = map.get(key);

            if (value == 2) {
                char ch = makeGene(key, key);
                geneSet.add(ch);
            }
        }

        for (String a : set) {
            for (String b : set) {
                if (a.equals(b)) {
                    continue;
                }
                char ch = makeGene(a, b);
                geneSet.add(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(geneSet.size()).append("\n");
        for (char ch : geneSet) {
            sb.append(ch).append(" ");
        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }

    public static char makeGene(String a, String b) {
        char first = a.charAt(0);
        char second = b.charAt(1);
        if (first > second) {
            return first;
        }
        return second;
    }
}
