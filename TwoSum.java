class Solution {
    int[] nums ={2,7,11,15};
    int target = 9;
    int[] out = {1,2};
    public int[] twoSum(int[] nums, int target) {
        for ( int i = 0; i < nums.length; i++  ){
            for ( int j = 0; j < nums.length; j++ ){
                
                int sum = nums[i] + nums[j];
                if(i != j && sum == target){
                    out[0] =i;
                    out[1] =j;
                    return out;
                }
            }
        }
        return null;
    }
}

 - KavinduKDWanasekara © -