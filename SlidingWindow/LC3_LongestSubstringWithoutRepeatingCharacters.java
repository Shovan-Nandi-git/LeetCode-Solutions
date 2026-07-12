class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int []frequency=new int[128];
        int max=0;
        int count=0;
        int left=0;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            frequency[a]++;
            while (frequency[a] > 1) {
                char leftChar = s.charAt(left);
                frequency[leftChar]--;
                left++;
            }
            max = Math.max(max, i-left+1);
        }
        return max;
    }
}
