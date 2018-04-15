/*
Given a string, return a new string where the last 3 chars are now in upper case. 
If the string has less than 3 chars, uppercase whatever is there. 
Note that str.toUpperCase() returns the uppercase version of a string.

endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
 */
package Warmup1;

/**
 *
 * @author asharma
 */
public class endUp {

    public String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        }
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back = str.substring(cut);  // this takes from cut to the end

        return front + back.toUpperCase();
    }
}
