package org.example.level0;

public class repeat_characters {
    /*
    문자 반복 출력하기

    문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는
    각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
     */

    public static void main(String[] args) {
        String my_string = "hello";
        int n = 3;

        String result = solution(my_string, n);

        System.out.println(result);
    }

    public static String solution(String my_string, int n) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            for (int j = 0; j < n; j++) {
                answer += ch;
            }
        }

        return answer;
    }
}