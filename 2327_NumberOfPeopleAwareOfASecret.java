class Solution {
    private static final int MOD = 1_000_000_007;

    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long[] dp = new long[n + forget + 1];
        long[] cnt = new long[n + forget + 1];
        cnt[1] = 1;

        for (int day = 1; day<=n; day++) {
            dp[day] = (dp[day] + cnt[day]) % MOD;
            dp[day + forget] = (dp[day + forget] - cnt[day] + MOD) % MOD;

            int startSharing = day + delay;
            int endSharing = Math.min(day + forget - 1, n);
            for (int shareDay = startSharing; shareDay <= endSharing; shareDay++) {
                cnt[shareDay] = (cnt[shareDay] + cnt[day]) % MOD;
            }
        }

        long result = 0;
        for (int i=1; i<=n; i++) {
            dp[i] = (dp[i] + dp[i-1]) % MOD;
            if (i==n) {
                result = dp[i];
            }
        }
        return (int) result;
    }
}