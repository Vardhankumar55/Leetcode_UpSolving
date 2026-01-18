class Solution {
    public int minOperations(int[] nums, int[] target){
        int n = nums.length;
        Set<Integer> set=new HashSet<>();//used bcoz we count the similar elemts as one operation only 
        for(int i=0;i<n;i++)
{
            if(nums[i]!=target[i]){
                set.add(nums[i]);
            }
}
        return set.size();
    }
}
