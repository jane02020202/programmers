package org.example.level0;

public class DivideNumber_04 {
    public static void main(String[] args) {

        /*
        나이 출력

        머쓱이는 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 2022년 기준 선생님의 나이 age가 주어질 때,
        선생님의 출생 연도를 return 하는 solution 함수를 완성해주세요
         */

        int age = 40;

        System.out.println(age);
    }

    static int solution(int age) {

        int answer = 2022 - age + 1;

        return answer;
    }
}
