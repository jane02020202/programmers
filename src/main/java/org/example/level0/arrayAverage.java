package org.example.level0;

public class arrayAverage {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(solution(numbers));
    }

    static double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;

        for ( int i = 0; i < numbers.length ; i++) {
            sum += numbers[i];
        }

        answer = (double)sum / numbers.length;

        return answer;
    }
}
