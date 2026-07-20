class Solution {
    public int maxArea(int[] h) {
        int res=0;
        for(int i=0;i<h.length;i++){
            for(int j=0;j<h.length;j++){
                
                res=Math.max(res,Math.abs(Math.min(h[i],h[j])*Math.abs(i-j)));
            }
        }
        return res;
    }
        
}
