class Solution {
    public int[] getConcatenation(int[] nums) {
        int lengthOfArray = nums.length;
        int[] answer = new int[2 * lengthOfArray];

        for(int i = 0; i < lengthOfArray; i++) {
            answer[i + lengthOfArray] = answer[i] = nums[i];
        }

        return answer;
    }
}