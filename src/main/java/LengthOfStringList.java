import java.util.Arrays;

public class LengthOfStringList {
    /*
    배열 원소의 길이

    문자열 배열 strlist가 매개변수로 주어집니다. strlist 각 원소의 길이를 담은 배열을 return하도록 solution 함수를 완성해주세요.
     */

    public static void main(String[] args) {

        String[] s1 = {"We", "are", "the", "world!"};
        String[] s2 = {"I", "Love", "Programmers."};

        LengthOfStringList solver = new LengthOfStringList();

        System.out.println(Arrays.toString(solver.solution(s1)));
        System.out.println(Arrays.toString(solver.solution(s2)));

    } static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {

            answer[i] = strlist[i].length();
        }
        return answer;
    }
}
