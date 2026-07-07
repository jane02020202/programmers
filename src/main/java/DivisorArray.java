import java.util.Arrays;

// 약수구하기  정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요

public class DivisorArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(24)));
    } static int[] solution(int n) {

        int count = 0;

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }

        int[] answer = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {

                answer[index] = i;
                index++;
            }
        }
        return answer;
    }
}

