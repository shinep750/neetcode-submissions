class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()==t.length()){

           char[] sA = s.toCharArray();
           char[] tA = t.toCharArray();

           Arrays.sort(sA);
           Arrays.sort(tA);

            return Arrays.equals(sA,tA);
        }else
            return false;
    }
}
