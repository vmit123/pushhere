class Solution {
    public List<List<Integer>> combination(int[] arr,int target,int i,int sum,List<Integer> res,List<List<Integer>> ans) {
        Arrays.sort(arr);
        int n = arr.length;
        if(target == sum) {
            ans.add(new ArrayList<>(res));
            return ans;
        }
        if(sum > target || i == arr.length) {
            return ans;
        }
       for(int j=i;j<n;j++) {
        if(j>i && arr[j] == arr[j-1]) continue;
        res.add(arr[j]);
        combination(arr,target,j+1,sum+arr[j],res,ans);
        res.remove(res.size()-1);
        // combination(arr,target,j+1,sum,res,ans); no need bcz j too bad hi rha h loop me to recursion call ki koi need nhi ee
        
       } 
        return ans;
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> res = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        return combination(candidates,target,0,0,res,ans);

    }
}