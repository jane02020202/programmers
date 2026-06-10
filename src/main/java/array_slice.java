import java.util.Arrays;

public class array_slice {
    /*
    배열 자르기

    정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, numbers의 num1번 째 인덱스부터
     num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
     */

    public static void main(String[] args) {
        int[] my_numbers = {1, 2, 3, 4, 5};
        int my_num1 = 1;
        int my_num2 = 3;

        int[] result = solution(my_numbers, my_num1, my_num2);

        System.out.println(Arrays.toString(result));
    }

    static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int index = 0;

        for (int i = num1; i <= num2; i++) {
            answer[index] = numbers[i];
            index++;
        }

        return answer;
    }
}

