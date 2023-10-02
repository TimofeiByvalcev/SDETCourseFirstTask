package helpers;

import java.util.Collections;
import java.util.List;

/**
 * ListHelpers class provides methods for sorting List in alphabetically and reversed alphabetically order.
 */
public class ListHelpers {
    public static void sortAlphabetically(List<String> list) {
        Collections.sort(list);
    }

    public static void sortReverseAlphabetically(List<String> list) {
        Collections.sort(list, Collections.reverseOrder());
    }
}