class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        int time = 0;
        for(int i=0;i<tickets.length;i++) {
            q.offer(i);
        }
        while(!q.isEmpty()) {
            int indx = q.poll();
            tickets[indx]--;
            time++;
            if(indx == k && tickets[indx] == 0 ){
            return time;
            }
            if(tickets[indx] !=0){
                q.offer(indx);  
            }
            
        }
        
        return time;
    }
}