// 3Sum
// Given an array of integers, nums, and an integer value, target, determine if there are any
// three integers in nums whose sum is equal to the target, that is, nums[i] + nums[j] + nums[k] == target.
// Return TRUE if three such integers exist in the array. Otherwise, return FALSE.

public class ThreeSum {
    public static void main(String[] args){
        System.out.println(isThreeSum(new int[] {3,7,1,2,8,4,5}, 20));
    }

    private static boolean isThreeSum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length ; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == target){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
