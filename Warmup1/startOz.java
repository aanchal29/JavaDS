/*
 Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".


startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
 */
package Warmup1;

/**
 *
 * @author asharma
 */
public class startOz {

    public String startOz(String str) {
        return str.contains("oz") ? "oz"
                : ((str.indexOf("z", 1) == 1) ? "z"
                : ((str.indexOf("o", 0) == 0 ? "o" : "")));
    }

}
