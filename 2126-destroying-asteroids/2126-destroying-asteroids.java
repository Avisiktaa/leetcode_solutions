class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);

        long curr=mass;
        for(int as:asteroids)
        {
            if(curr<as)
            return false;

            curr+=as;
        }
        return true;
    }
}