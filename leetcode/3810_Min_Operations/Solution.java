// Minimal valid Java source to remove syntax errors.
// Non-public class so filename need not match the class name.
class Solution {
    public int minOperations(int[] nums, int[] target){
        int n = nums.length;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
{
            if(nums[i]!=target[i]){
                set.add(nums[i]);
            }
}
        return set.size();
    }
}
