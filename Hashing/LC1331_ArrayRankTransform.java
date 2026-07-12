class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) return arr;
        int temp[][]=new int[arr.length][2];
        for(int i=0;i<arr.length;i++){
            temp[i][0]=arr[i];
            temp[i][1]=i;
        }
        Arrays.sort(temp , (a,b) -> Integer.compare(a[0],b[0]));
        int count=1;
        arr[temp[0][1]] = count;
        for(int i=1;i<arr.length ;i++){
            if(temp[i][0]!=temp[i-1][0]){
                count++;
            }
            arr[temp[i][1]]=count;
            
        }
        return arr;
    }
}