public class RemoveChar {
    public static void main(String[] args) {

        /*
        특정 문자 제거하기

        문자열 my_string과 문자 letter이 매개변수로 주어집니다. my_string에서
        letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.

        */

        String my_string = "abcdef";
        String letter = "f";

        String result = solution(my_string, letter);

        System.out.println(result);

    } static String solution(String my_string, String letter) {
        String answer = "";

        char target = letter.charAt(0);

        for (int i = 0; i < my_string.length(); i++) {

            char current = my_string.charAt(i);

            if (current != target) {
                answer += current;
            }
        }
        return answer;
    }

}
