import java.util.Arrays;

public class MaxAndIndex {
    /*
    정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
     */
    public static void main(String[] args) {
        int[] testArray = {1, 8, 3};

        System.out.println(Arrays.toString(new MaxAndIndex().solution(testArray)));
        // new MaxAndIndex() - 클래스의 객체(인스턴스)를 새로 하나 만듦. 왜? olution 메서드가 static이 아니라서, 객체를 만들어야 그 메서드를 호출할 수 있음.
        //static이 붙은 건 = "그냥 바로 쓸 수 있는 것. / static이 안 붙은 건 = "먼저 준비물을 만들어야 쓸 수 있는 것"
        // -> solution은 static이 아니라서 new MaxAndIndex()로 객체를 하나 만든 다음에야 쓸 수 있음.

        //.solution(testArray) - 방금 만든 객체의 solution 메서드를 호출하면서, testArray를 인자로 넘김.
        //solution 메서드는 배열에서 최댓값과 그 인덱스를 찾아서 {max, maxIndex} 형태의 새 배열을 리턴

        //Arrays.toString(...) - 배열은 그냥 출력하면 [I@1b6d3586 같은 이상한 값이 나옴.
        //Arrays.toString을 쓰면 [8, 1]처럼 사람이 보기 좋은 문자열로 바꿔줌.

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