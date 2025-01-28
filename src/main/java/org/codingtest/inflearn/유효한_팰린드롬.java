package org.codingtest.inflearn;

import java.util.Scanner;

public class 유효한_팰린드롬 {

    public String solution(String str) {

        /*
        str = str.toUpperCase();
        int lt = 0, rt = str.length() - 1;
        while(lt < rt) {
            if (!Character.isAlphabetic(str.charAt(lt))) {
                lt++;
                continue;
            }
            if (!Character.isAlphabetic(str.charAt(rt))) {
                rt--;
                continue;
            }
            if (str.charAt(lt) != str.charAt(rt)) {
                return "NO";
            }
            lt++;
            rt--;
        }

        return "YES";
         */

        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args){
        유효한_팰린드롬 main = new 유효한_팰린드롬();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(main.solution(str));
    }
}
