import java.util.Arrays;

public class max_product_solution {

    /*
    최대값 만들기(1)

    정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해
    만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
     */

    public static void main(String[] args) {
        int[] my_numbers = {0, 31, 24, 10, 1, 9};

        int result = solution(my_numbers);

        System.out.println(result);
    } static int solution(int[] numbers) {
        Arrays.sort(numbers);

        int lastIndex = numbers.length - 1;
        int secondLastIndex = numbers.length - 2;

        return numbers[lastIndex] * numbers[secondLastIndex];
    }
}