import java.util.ArrayList;
import java.util.Collections;

public class SortDigitsInString {

    /*
    문자열 정렬하기

    문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
     */
    static String my_string = "hi12392";

    public static void main(String[] args) {
        int[] result = solution(my_string);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    static int[] solution(String my_string) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if (Character.isDigit(ch)) {
                list.add(ch - '0');
            }
        }

        Collections.sort(list);

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}