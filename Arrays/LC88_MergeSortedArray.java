class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a=m-1;
        int b=n-1;
        int pos=m+n-1;
        while(a>=0 & b>=0){
            if(nums1[a]>nums2[b]){
                nums1[pos]=nums1[a];
                a--;
                pos--;
            }
            else{
                nums1[pos]=nums2[b];
                b--;
                pos--;
            }
        }
        while(b>=0){
            nums1[pos]=nums2[b];
            b--;
            pos--;
        }

    }
}