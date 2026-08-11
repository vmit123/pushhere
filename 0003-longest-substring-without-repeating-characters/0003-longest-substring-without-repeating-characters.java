class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0;
        String curr = "";
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            int index = curr.indexOf(ch);
            if(index != -1) {
                curr = curr.substring(index + 1);
            }
            curr += ch;
            maxlen = Math.max(maxlen,curr.length());
        }
        return maxlen;
    }
}

 

