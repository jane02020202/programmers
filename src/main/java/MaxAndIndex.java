import java.util.Arrays;

public class MaxAndIndex {
    /*
    정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
     */
    public static void main(String[] args) {
        int[] testArray = {1, 8, 3};

        System.out.println(Arrays.toString(new MaxAndIndex().solution(testArray)));
    } static int[] solution(int[] array) {

        int max = array[0];
        int maxIndex = 0;

        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
                maxIndex = i;
            }
        }

        int[] answer = {max, maxIndex};
        return answer;
    }
}