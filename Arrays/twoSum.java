class Solution {
    public void twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i=0; i<nums.length - 1; i++){
            for(int j=i; j<nums.length - 1; j++){
                if(target == nums[i]+nums[j+1]){
                    arr[0] = i;
                    arr[1] = j+1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
}

public class twoSum{
    public static void main(String[] args){
        Solution ob = new Solution();
        int[] nums = {1,2,3,4,5};
        ob.twoSum(nums, 9);

    }
}
