// Leetcode 7: (EASY)
//  https://leetcode.com/problems/reverse-integer/

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    public static int reverse(int x) {
        long ans = 0;

        while (x != 0) {
            int rem = x % 10;
            x = x / 10;

            ans = ans * 10 + rem;
        }

        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) 
            return 0;
    
        return (int)ans;
    }
}