class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map=new HashMap<>();

        for(String str: strs){
            char[] s = str.toCharArray();
            Arrays.sort(s);
            String k= new String(s);
            if(!map.containsKey(k)){
                map.put(k,new ArrayList<>());
            }
            map.get(k).add(str); 
        }
    return new ArrayList<>(map.values());
    }
}
