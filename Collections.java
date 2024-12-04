import java.util.Comparator;
import java.util.List;

public class Collections {

    // static int binarySearch(List list, T key)
    public static <T extends Comparable<? super T>> int binarySearch(List<T> list, T key) {
        return binarySearch(list, key, Comparable::compareTo);
    }

    // static int binarySearch(List list, T key, Comparator c)
    public static <T> int binarySearch(List<T> list, T key, Comparator<? super T> c) {
        int low = 0, high = list.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int cmp = c.compare(list.get(mid), key);
            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
