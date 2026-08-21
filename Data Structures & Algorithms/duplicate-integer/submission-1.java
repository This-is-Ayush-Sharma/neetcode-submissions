class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> counterBox = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(counterBox.containsKey(nums[i])){
                counterBox.put(nums[i], counterBox.get(nums[i])+1);
                continue;
            }
            counterBox.put(nums[i],1);
        }
        for(Integer key : counterBox.keySet()){
            if(counterBox.get(key)>1){
                return true;
            }
        }
        return false;
    }
}
