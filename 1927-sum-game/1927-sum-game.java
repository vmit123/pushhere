class Solution {
    public boolean sumGame(String num) {
        int count1=0;
        int count2=0;
        int sum1=0;
        int sum2=0;
        for(int i = 0;i<num.length()/2;i++) {
            if(num.charAt(i) == '?') {
                count1++;
            }
            else {
            int c = num.charAt(i);
            int digit = c-'0';
            sum1 += digit;
            }
        }
        for(int i = num.length()/2;i<num.length();i++) {
           if(num.charAt(i) == '?') {
                count2++;
            }
            else {
            int c = num.charAt(i);
            int digit = c-'0';
            sum2 += digit;
            }
        } 
        
        if((count1 + count2) % 2 != 0) {
            return true;
        }

        int difference = sum1 - sum2;

        if(count1 > count2) {
            difference += 9 * (count1 - count2) / 2;
        }
        else {
            difference -= 9 * (count2 - count1) / 2;
        }

        if(difference == 0) {
            return false;
        }

        return true;
    }
}