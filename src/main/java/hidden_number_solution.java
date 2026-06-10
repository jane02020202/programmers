public class hidden_number_solution {

    public static void main(String[] args) {

        /*
        숨어 있는 숫자의 덧셈(1)

        문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
         */
        String my_string = "aAb1B2cC34oOp";

        int result = solution(my_string);

        System.out.println(result);
    } static int solution(String my_string) {
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if (Character.isDigit(ch)) {
                answer += (ch - '0');
            }
        }

        return answer;
    }
}