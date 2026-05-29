package org.example.level0;

public class reverse_string {
    /*

    뒤집힌 문자열
    문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은
    문자열을 return하도록 solution 함수를 완성해주세요.

     */

    public static void main(String[] args) {

        String my_string = "bread";

        String result = solution(my_string);

        System.out.println(result);

    } static String solution(String my_string) {
        String answer = "";

        for(int i = my_string.length() -1 ; i>=0 ; i-- ) {
            answer += my_string.charAt(i);
        }

        return answer;
    }
}
