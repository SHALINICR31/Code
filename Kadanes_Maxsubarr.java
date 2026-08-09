class Solution {
    int maxSubarraySum(int[] arr) {
    
    int currsum=0;
    int maxsum=arr[0];
    int n=arr.length;
    for(int i=0;i<n;i++)
    {
        currsum=Math.max(arr[i],currsum+arr[i]);
        maxsum=Math.max(maxsum,currsum);
    }
    
    return maxsum;
}
    
}
