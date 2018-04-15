/*
Given an int n, return the absolute difference between n and 21, 
except return double the absolute difference if n is over 21.

diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
 */
package Warmup1;

/**
 *
 * @author asharma
 */
public class diff21 {

    public int diff21(int n) {
        int diff = 0;
        if (n <= 21) {
            diff = 21 - n;
        } else {
            diff = (n - 21) * 2;
        }
        return diff;
    }

}
