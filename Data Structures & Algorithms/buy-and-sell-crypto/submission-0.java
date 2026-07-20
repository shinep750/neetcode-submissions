class Solution {
    public int maxProfit(int[] p) {
        int res=0,diff=0;
        for(int i=0;i<p.length;i++){
            for(int j=i+1;j<p.length;j++){
                diff=p[j]-p[i];
                res=Math.max(res,diff);
            }
        }
        return res;
    }
}