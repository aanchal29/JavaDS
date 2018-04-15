/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.


mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
 */
package Warmup1;

/**
 *
 * @author asharma
 */
public class mixStart {

    public boolean mixStart(String str) {
        return (str.indexOf("ix") == 1) ? true : false;
    }

}
