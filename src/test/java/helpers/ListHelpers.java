package helpers;

import java.util.Collections;
import java.util.List;

/**
 * ListHelpers class provides methods for sorting List in alphabetically and reversed alphabetically order.
 */
public class ListHelpers {

    /**
     * The sortAlphabetically() method receive list of string as parameter and sort it in alphabetical order.
     */
    public static void sortAlphabetically(List<String> list) {
        Collections.sort(list);
    }

    /**
     * The sortReverseAlphabetically() method receive list of string as parameter and sort it in reversed alphabetical order.
     */
    public static void sortReverseAlphabetically(List<String> list) {
        Collections.sort(list, Collections.reverseOrder());
    }
}