package org.example.level0;

public class PizzaShare {
    public static void main(String[] args) {

        /*

        피자 나눠먹기(1)

        머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때,
        모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
         */

        int n = 15;

        System.out.println(n);
    }
    static int solution(int n) {
        int answer = 0;

        if (n % 7 == 0) {
            answer = n / 7;
        }else{
            answer = (n / 7) + 1; // 15/7 = 2 -> 피자 2판 시키자, 근데 뒤에 소수점 남아있음, 15명 피자 다 못 먹음
                                  // 그래서 남은 사람들을 위해 1판 더 주문해야 한다는 뜻
        }

        return answer;
    }
}
