class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {

            int current = asteroids[i];
            boolean destroyed = false;

            while (!st.empty() && st.peek() > 0 && current < 0) {

                if (Math.abs(st.peek()) < Math.abs(current)) {
                    st.pop();
                }
                else if (Math.abs(st.peek()) == Math.abs(current)) {
                    st.pop();
                    destroyed = true;
                    break;
                }
                else {
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                st.push(current);
            }
        }

        int[] ans = new int[st.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}