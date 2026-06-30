class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> main = new Stack<>();
        
        int area = 0;
        for(int i=0;i<heights.length;i++) {
            while (!main.isEmpty() && heights[i] < heights[main.peek()]) {
                int height = heights[main.pop()];
                int width;
                if (main.isEmpty()) {
                    width = i;
                } else {
                    width = i - main.peek() - 1;
                }
                area = Math.max(area, height * width);
            }

            main.push(i);
        }
        while(!main.isEmpty()) {
            int len = heights[main.pop()];
            int width;
            if(main.isEmpty()) {
                width = heights.length;
            }
            else {
                width = heights.length - main.peek()-1;
            }
            area = Math.max(area,len * width);
        }
        
        
        return area;
    }
}