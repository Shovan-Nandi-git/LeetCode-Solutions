class Solution {
    public static void margesort(int nums[],int si, int ei){
        if(si>=ei)
            return;
        int mid= si+(ei-si)/2;
        margesort(nums,si,mid);
        margesort(nums,mid+1,ei);
        marge(nums,si,mid,ei);
        
    }
    public static void marge(int nums[],int si, int mid, int ei){
        int temp[]=new int [ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(nums[i]<nums[j]){
                temp[k]=nums[i];
                i++;
            }
            else{
                temp[k]=nums[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k]=nums[i];
            i++;
            k++;
        }
        while(j<=ei){
            temp[k]=nums[j];
            j++;
            k++;
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            nums[i]=temp[k];
        }

    }
    public int[] sortArray(int[] nums) {
       margesort(nums,0,nums.length-1);
       return nums;
    }
}