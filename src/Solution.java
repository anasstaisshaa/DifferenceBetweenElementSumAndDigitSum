import java.util.Arrays;

class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        for (int i = 0; i < nums.length; i++){
            elementSum += nums[i];
        }
        String digit = Arrays.toString(nums).replaceAll("\\D", "");
        System.out.println(digit);
        int digitSum = 0;
        for(int i = 0; i < digit.length(); i++){
            digitSum += (digit.charAt(i) - '0');
        }
        int answer = elementSum - digitSum;
        return answer;
    }
}
