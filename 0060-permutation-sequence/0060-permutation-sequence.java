class Solution {
    public List<List<Integer>> get(int n,int k,List<List<Integer>> subset,List<Integer> ans,int[] nums,boolean[] vis) {
        if(ans.size() == n){
            subset.add(new ArrayList<>(ans));
            return subset;
        }
        
        for(int i=0;i<n;i++) {
            if (vis[i]) continue;
            vis[i]= true;
            ans.add(nums[i]);
            get(n,k,subset,ans,nums,vis);
            ans.remove(ans.size()-1);
            vis[i] = false;
        }
        return subset;
    }
    public String getPermutation(int n, int k) {
        List<List<Integer>> subset = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[n];
        int[] nums = new int[n];
        for(int  i =0;i<n;i++) {
            nums[i] = i+1;
        }
        get(n,k,subset,ans,nums,vis);
        List<Integer> temp = subset.get(k-1);
        StringBuilder sb  = new StringBuilder();
        for(int i:temp) {
            sb.append(i);
        }
        return sb.toString();
    }
}