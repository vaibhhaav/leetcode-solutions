class Solution {
    public int findNumbers(int[] nums) {
        int even=0;
        for (int i=0; i<nums.length; i++) {
            int count = 0;
            int num = nums[i];
            while(num>0) {
                num /= 10;
                count++;
            }
            if(count%2 == 0) {
                even++;
            }
        }
        return even;
    }
}