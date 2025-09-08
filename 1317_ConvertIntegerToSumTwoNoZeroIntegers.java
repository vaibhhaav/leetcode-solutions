class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int i=1; i<=n; i++) {
            int j = n-i;
            if (!containszero(i) && !containszero(j)) {
                return new int[]{i,j};
            }
        }
        return new int[]{};
    }

    private boolean containszero(int num) {
        while (num>0) {
            if (num%10 == 0) return true;
            num /= 10;
        }
        return false;
    }
}