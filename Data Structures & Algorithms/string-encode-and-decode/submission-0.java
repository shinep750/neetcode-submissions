class Solution {

    public String encode(List<String> strs) {

        StringBuilder encoded_string=new StringBuilder();
        for(String str: strs){
            encoded_string.append(str.length()).append("#").append(str);
        }
        return encoded_string.toString();
    }

    public List<String> decode(String str) {

        List<String> decoded_strs = new ArrayList<>();
        int i=0;

        while(i<str.length()){
            int j=i;
            while(str.charAt(j) != '#' ){
                j++;
            }
            int length=Integer.parseInt(str.substring(i,j));
            j++;
            decoded_strs.add(str.substring(j,j+length));
            i=j+length;
        }


        return decoded_strs;
    }
}
