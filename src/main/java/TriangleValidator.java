import java.util.Arrays;

class Solution {

    public int solution(int[] sides) {
        Arrays.sort(sides);

        if (sides[2] < sides[0] + sides[1]) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] sides = {1, 2, 3};
        System.out.println(sol.solution(sides));
    }
}