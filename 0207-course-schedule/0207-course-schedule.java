class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0;i<numCourses;i++) {
            graph.add(new ArrayList<>());
        }
        // adj aur indegree sath sath kiya ider 
        int[] indegree = new int[numCourses];
        for(int[] p: prerequisites) {
            int course = p[0];
            int pre = p[1];
            graph.get(pre).add(course);
            indegree[course]++;
        }
        //queue me dala
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i<numCourses;i++) {
            if(indegree[i] == 0) {
                q.offer(i);
            }
        }
        int count = 0;
        //bfs
        while(!q.isEmpty()) {
            int curr = q.poll();
            count++;
            for(int neigh : graph.get(curr)) {
                indegree[neigh]--;
                if(indegree[neigh] == 0) {
                    q.offer(neigh);
                }
            }
        }
        return count == numCourses;
    }
}