package com.greenpineyu.fel.common;

public class StringUtils {
	
    /**
     * Represents a failed index search.
     * @since 2.1
     */
    public static final int INDEX_NOT_FOUND = -1;
	
	 public static boolean isEmpty(CharSequence cs) {
       return cs == null || cs.length() == 0;
   }

   /**
    * <p>Checks if a CharSequence is not empty ("") and not null.</p>
    *
    * <pre>
    * StringUtils.isNotEmpty(null)      = false
    * StringUtils.isNotEmpty("")        = false
    * StringUtils.isNotEmpty(" ")       = true
    * StringUtils.isNotEmpty("bob")     = true
    * StringUtils.isNotEmpty("  bob  ") = true
    * </pre>
    *
    * @param cs  the CharSequence to check, may be null
    * @return {@code true} if the CharSequence is not empty and not null
    * @since 3.0 Changed signature from isNotEmpty(String) to isNotEmpty(CharSequence)
    */
   public static boolean isNotEmpty(CharSequence cs) {
       return !StringUtils.isEmpty(cs);
   }
   

   /**
    * <p>Replaces all occurrences of a String within another String.</p>
    *
    * <p>A {@code null} reference passed to this method is a no-op.</p>
    *
    * <pre>
    * StringUtils.replace(null, *, *)        = null
    * StringUtils.replace("", *, *)          = ""
    * StringUtils.replace("any", null, *)    = "any"
    * StringUtils.replace("any", *, null)    = "any"
    * StringUtils.replace("any", "", *)      = "any"
    * StringUtils.replace("aba", "a", null)  = "aba"
    * StringUtils.replace("aba", "a", "")    = "b"
    * StringUtils.replace("aba", "a", "z")   = "zbz"
    * </pre>
    *
    * @see #replace(String text, String searchString, String replacement, int max)
    * @param text  text to search and replace in, may be null
    * @param searchString  the String to search for, may be null
    * @param replacement  the String to replace it with, may be null
    * @return the text with any replacements processed,
    *  {@code null} if null String input
    */
   public static String replace(String text, String searchString, String replacement) {
       return replace(text, searchString, replacement, -1);
   }
   

   /**
    * <p>Replaces a String with another String inside a larger String,
    * for the first {@code max} values of the search String.</p>
    *
    * <p>A {@code null} reference passed to this method is a no-op.</p>
    *
    * <pre>
    * StringUtils.replace(null, *, *, *)         = null
    * StringUtils.replace("", *, *, *)           = ""
    * StringUtils.replace("any", null, *, *)     = "any"
    * StringUtils.replace("any", *, null, *)     = "any"
    * StringUtils.replace("any", "", *, *)       = "any"
    * StringUtils.replace("any", *, *, 0)        = "any"
    * StringUtils.replace("abaa", "a", null, -1) = "abaa"
    * StringUtils.replace("abaa", "a", "", -1)   = "b"
    * StringUtils.replace("abaa", "a", "z", 0)   = "abaa"
    * StringUtils.replace("abaa", "a", "z", 1)   = "zbaa"
    * StringUtils.replace("abaa", "a", "z", 2)   = "zbza"
    * StringUtils.replace("abaa", "a", "z", -1)  = "zbzz"
    * </pre>
    *
    * @param text  text to search and replace in, may be null
    * @param searchString  the String to search for, may be null
    * @param replacement  the String to replace it with, may be null
    * @param max  maximum number of values to replace, or {@code -1} if no maximum
    * @return the text with any replacements processed,
    *  {@code null} if null String input
    */
   public static String replace(String text, String searchString, String replacement, int max) {
       if (isEmpty(text) || isEmpty(searchString) || replacement == null || max == 0) {
           return text;
       }
       int start = 0;
       int end = text.indexOf(searchString, start);
       if (end == INDEX_NOT_FOUND) {
           return text;
       }
       int replLength = searchString.length();
       int increase = replacement.length() - replLength;
       increase = (increase < 0 ? 0 : increase);
       increase *= (max < 0 ? 16 : (max > 64 ? 64 : max));
       StringBuilder buf = new StringBuilder(text.length() + increase);
       while (end != INDEX_NOT_FOUND) {
           buf.append(text.substring(start, end)).append(replacement);
           start = end + replLength;
           if (--max == 0) {
               break;
           }
           end = text.indexOf(searchString, start);
       }
       buf.append(text.substring(start));
       return buf.toString();
   }
   

   /**
    * <p>Removes all occurrences of a character from within the source string.</p>
    *
    * <p>A {@code null} source string will return {@code null}.
    * An empty ("") source string will return the empty string.</p>
    *
    * <pre>
    * StringUtils.remove(null, *)       = null
    * StringUtils.remove("", *)         = ""
    * StringUtils.remove("queued", 'u') = "qeed"
    * StringUtils.remove("queued", 'z') = "queued"
    * </pre>
    *
    * @param str  the source String to search, may be null
    * @param remove  the char to search for and remove, may be null
    * @return the substring with the char removed if found,
    *  {@code null} if null String input
    * @since 2.1
    */
   public static String remove(String str, char remove) {
       if (isEmpty(str) || str.indexOf(remove) == INDEX_NOT_FOUND) {
           return str;
       }
       char[] chars = str.toCharArray();
       int pos = 0;
       for (int i = 0; i < chars.length; i++) {
           if (chars[i] != remove) {
               chars[pos++] = chars[i];
           }
       }
       return new String(chars, 0, pos);
   }
   
   //-----------------------------------------------------------------------
   /**
    * <p>Compares two CharSequences, returning {@code true} if they are equal.</p>
    *
    * <p>{@code null}s are handled without exceptions. Two {@code null}
    * references are considered to be equal. The comparison is case sensitive.</p>
    *
    * <pre>
    * StringUtils.equals(null, null)   = true
    * StringUtils.equals(null, "abc")  = false
    * StringUtils.equals("abc", null)  = false
    * StringUtils.equals("abc", "abc") = true
    * StringUtils.equals("abc", "ABC") = false
    * </pre>
    *
    * @see java.lang.String#equals(Object)
    * @param cs1  the first CharSequence, may be null
    * @param cs2  the second CharSequence, may be null
    * @return {@code true} if the CharSequences are equal, case sensitive, or
    *  both {@code null}
    * @since 3.0 Changed signature from equals(String, String) to equals(CharSequence, CharSequence)
    */
   public static boolean equals(CharSequence cs1, CharSequence cs2) {
       return cs1 == null ? cs2 == null : cs1.equals(cs2);
   }

}
