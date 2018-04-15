/*
 Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
 */
package Warmup1;

/**
 *
 * @author asharma
 */
public class front22 {

    public String front22(String str) {
        int l = str.length();
        if (l >= 2) {
            return str.substring(0, 2) + str + str.substring(0, 2);
        } else {
            return str.substring(0, l) + str + str.substring(0, l);
        }
    }

}
