/*Return true if the given non-negative number is a multiple of 3 or a multiple of 5. 
Use the % "mod" operator

or35(3) → true
or35(10) → true
or35(8) → false
 */
package Warmup1;

/**
 *
 * @author asharma
 */
public class or35 {

    public boolean or35(int no) {
        return (no % 3 == 0 && no % 5 == 0) || (no % 3 == 0) || (no % 5 == 0);
    }

}
