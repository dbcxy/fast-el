package com.greenpineyu.fel.common;

import java.lang.reflect.Array;


public class ArrayUtils {
    /**
     * <p>Checks if an array of Objects is empty or {@code null}.</p>
     *
     * @param array  the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(Object[] array) {
        return array == null || array.length == 0;
    }
    
    /**
     * <p>Outputs an array as a String, treating {@code null} as an empty array.</p>
     *
     * <p>Multi-dimensional arrays are handled correctly, including
     * multi-dimensional primitive arrays.</p>
     *
     * <p>The format is that of Java source code, for example <code>{a,b}</code>.</p>
     *
     * @param array  the array to get a toString for, may be {@code null}
     * @return a String representation of the array, '{}' if null array input
     */
//    public static String toString(Object array) {
//    	
//        return toString(array, "{}");
//    }
//    
//    /**
//     * <p>Outputs an array as a String handling {@code null}s.</p>
//     *
//     * <p>Multi-dimensional arrays are handled correctly, including
//     * multi-dimensional primitive arrays.</p>
//     *
//     * <p>The format is that of Java source code, for example <code>{a,b}</code>.</p>
//     *
//     * @param array  the array to get a toString for, may be {@code null}
//     * @param stringIfNull  the String to return if the array is {@code null}
//     * @return a String representation of the array
//     */
//    public static String toString(Object array, String stringIfNull) {
//        if (array == null) {
//            return stringIfNull;
//        }
//        return new ToStringBuilder(array, ToStringStyle.SIMPLE_STYLE).append(array).toString();
//    }
    
    /**
     * <p>Produces a new array containing the elements between
     * the start and end indices.</p>
     *
     * <p>The start index is inclusive, the end index exclusive.
     * Null array input produces null output.</p>
     *
     * <p>The component type of the subarray is always the same as
     * that of the input array. Thus, if the input is an array of type
     * {@code Date}, the following usage is envisaged:</p>
     *
     * <pre>
     * Date[] someDates = (Date[])ArrayUtils.subarray(allDates, 2, 5);
     * </pre>
     *
     * @param <T> the component type of the array
     * @param array  the array
     * @param startIndexInclusive  the starting index. Undervalue (&lt;0)
     *      is promoted to 0, overvalue (&gt;array.length) results
     *      in an empty array.
     * @param endIndexExclusive  elements up to endIndex-1 are present in the
     *      returned subarray. Undervalue (&lt; startIndex) produces
     *      empty array, overvalue (&gt;array.length) is demoted to
     *      array length.
     * @return a new array containing the elements between
     *      the start and end indices.
     * @since 2.1
     */
    public static <T> T[] subarray(T[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return null;
        }
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        }
        if (endIndexExclusive > array.length) {
            endIndexExclusive = array.length;
        }
        int newSize = endIndexExclusive - startIndexInclusive;
        Class<?> type = array.getClass().getComponentType();
        if (newSize <= 0) {
            @SuppressWarnings("unchecked") // OK, because array is of type T
            final T[] emptyArray = (T[]) Array.newInstance(type, 0);
            return emptyArray;
        }
        @SuppressWarnings("unchecked") // OK, because array is of type T
        T[] subarray = (T[]) Array.newInstance(type, newSize);
        System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        return subarray;
    }
}
