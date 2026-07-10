class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<num.length();i++) {
            
            while(k> 0 && !st.isEmpty() && st.peek() > num.charAt(i)) {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
            
        }
        while(k>0){
                st.pop();
                k--;
            }
            StringBuilder sb = new StringBuilder();
            while(!st.isEmpty()) {
                sb.append(st.pop());
            }
            sb.reverse();
        int i = 0;

        while (i < sb.length() && sb.charAt(i) == '0') {
            i++;
        }

        if (i == sb.length()) {
            return "0";
        }
        
       return sb.substring(i);
        
    }
}