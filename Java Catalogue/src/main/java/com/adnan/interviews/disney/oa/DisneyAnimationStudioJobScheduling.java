package com.adnan.interviews.disney.oa;

//    [Ads DS N1] Disney Animation Studio Job Scheduling
//    At a Disney animation studio, there are m animation jobs that need to be scheduled across n animation processors. A schedule is considered balanced if the difference in the number of jobs between any two neighboring processors does not exceed 1.
//    The kth processor is the most advanced (used for rendering key scenes), so it should be assigned the maximum number of jobs possible while still keeping the schedule balanced. Your task is to determine the maximum number of jobs that can be assigned to the kth processor under these conditions.
//    Note: Every processor must be assigned at least one job.
//
//    Example
//    Consider n = 5, m = 11, k = 3.
//    Consider the following job schedules:
//    Schedule                  Is balanced?                    Jobs on kth processor
//    [1, 2, 3, 4, 1]               No                                  --
//    [1, 2, 3, 3, 2]               Yes                                 3
//    [2, 2, 2, 2, 3]               Yes                                 2
//    [2, 2, 3, 2, 2]               Yes                                 3
//    [1, 1, 7, 1, 1]               No                                  --
//    [4, 3, 2, 1, 1]               Yes                                 2
//    In each schedule, there are 11 jobs distributed among 5 processors. Note that k uses 1-based indexing.
//
//    The first schedule is not balanced because the job difference between the 4th and 5th processors is 3, which exceeds 1.
//    The fifth schedule is not balanced because the job differences between the 2nd and 3rd, and between the 3rd and 4th processors exceed 1.
//
//    Among all balanced schedules, the maximum number of jobs that can be scheduled on the 3rd processor is 3. Thus, the answer is 3.
//
//    Function Description
//    Complete the function getMaximumJobs in the editor with the following parameters:
//
//    int n: the number of processors
//    int m: the number of jobs
//    int k: the 1-based index of the most efficient processor
//
//            Returns
//
//    int: the maximum number of jobs that can be scheduled on the kth processor maintaining a balanced schedule
//
//
//            Constraints
//
//    1 <= n <= 10^5
//    n <= m <= 10^9
//    1 <= k <= n
//
//
//    Sample Case 0
//    Input: n = 5, m = 11, k = 5
//    Output: 4
//    Explanation: One optimal job schedule is [1, 1, 2, 3, 4].
//
//    Sample Case 1
//    Input: n = 5, m = 16, k = 2
//    Output: 4
//    Explanation: One optimal job schedule is [4, 4, 3, 3, 2].

public class DisneyAnimationStudioJobScheduling {

    public int getMaximumJobs(int n, int m, int k) {
        long low = 1;
        long high = m;
        long ans = 1;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (possible(n, k, m, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return (int) ans;
    }

    private boolean possible(int n, int k, int m, long peak) {
        long left = required(peak, k - 1);
        long right = required(peak, n - k);

        return left + peak + right <= m;
    }

    private long required(long peak, long len) {
        // decreasing sequence starting from peak-1
        // but values cannot go below 1

        // peak is 7

        if (peak > len) {
            long low = peak - len;

            // n/2 * (a + l)
            // a = peak-1
            // l = peak-len
            // n = length
            // 6, 5, 4, 3
            return (peak - 1 + low) * len / 2;
        }

        long ones = len - (peak - 1);

        // (n * (n+1)) / 2
        // n = (peak - 1)
        // 6, 5, 4, 3, 2, 1, 1, 1, 1
        return (peak - 1) * peak / 2 + ones;
    }

}