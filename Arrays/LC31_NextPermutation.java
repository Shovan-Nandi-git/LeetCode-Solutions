class Solution {
    public void nextPermutation(int[] nums) {
        int braking_poient=-1;
        int swap_target;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                braking_poient=i-1;
                break;
            }
        }
        if(braking_poient!=-1){
            for(int i=nums.length-1;i>braking_poient;i--){
                if(nums[braking_poient]<nums[i]){
                int temp=nums[i];
                nums[i]=nums[braking_poient];
                nums[braking_poient]=temp;
                break;
            }
        }
        }
        int left=braking_poient+1;
        int right=nums.length-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }

    }
}