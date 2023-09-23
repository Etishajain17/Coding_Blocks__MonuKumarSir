package ClassDays.Day45;
/*
https://leetcode.com/problems/patching-array/
 */

class PatchingArray {
    public int minPatches(int[] nums, int n) {
        long missing=1;
        int i=0;
        int ans=0;
        while(missing<=n){
            if(i<nums.length && nums[i]<=missing){
                missing+=nums[i];
                i++;
            }else{
                ans++;
                missing+=missing;
            }
        }
        return ans;
    }
}