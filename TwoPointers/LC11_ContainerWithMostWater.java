class Solution {
    public int maxArea(int[] height) {
        int maxwater=0;
        int left=0,right=height.length-1;
        while(left<right){
            int currentwater=Math.min(height[left],height[right])*(right-left);
            maxwater=Math.max(maxwater,currentwater);
            if(height[left]<=height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxwater;
    }
}