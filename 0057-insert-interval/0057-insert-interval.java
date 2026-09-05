class Solution {
    class Job {
        int start;
        int end;
        Job(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {

        int n = intervals.length;
        Job[] arr = new Job[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = new Job(intervals[i][0], intervals[i][1]);
        }
        arr[n] = new Job(newInterval[0], newInterval[1]);

        Arrays.sort(arr, (a, b) -> Integer.compare(a.start, b.start));

        List<Job> res = new ArrayList<>();

        Job lastend = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].start <= lastend.end) {
                lastend.end = Math.max(lastend.end, arr[i].end);
            }
           
            else {
                res.add(lastend);
                lastend = arr[i];
            }
        }
        res.add(lastend);

        int[][] ans = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            ans[i][0] = res.get(i).start;
            ans[i][1] = res.get(i).end;
        }

        return ans;
    }
}