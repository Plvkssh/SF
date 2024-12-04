import java.util.Comparator;

public class Arrays {

    // static int binarySearch(byte[] a, byte key)
    public static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, 0, a.length, key);
    }

    // static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key)
    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        validateRange(a.length, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // static int binarySearch(char[] a, char key)
    public static int binarySearch(char[] a, char key) {
        return binarySearch(a, 0, a.length, key);
    }

    // static int binarySearch(char[] a, int fromIndex, int toIndex, char key)
    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        validateRange(a.length, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // static int binarySearch(double[] a, double key)
    public static int binarySearch(double[] a, double key) {
        return binarySearch(a, 0, a.length, key);
    }

    // static int binarySearch(double[] a, int fromIndex, int toIndex, double key)
    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        validateRange(a.length, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // static int binarySearch(float[] a, float key)
    public static int binarySearch(float[] a, float key) {
        return binarySearch(a, 0, a.length, key);
    }

    // static int binarySearch(float[] a, int fromIndex, int toIndex, float key)
    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        validateRange(a.length, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // static int binarySearch(int[] a, int key)
    public static int binarySearch(int[] a, int key) {
        return binarySearch(a, 0, a.length, key);
    }

    // static int binarySearch(int[] a, int fromIndex, int toIndex, int key)
    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        validateRange(a.length, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // static int binarySearch(long[] a, long key)
    public static int binarySearch(long[] a, long key) {
        return binarySearch(a, 0, a.length, key);
    }

    // static int binarySearch(long[] a, int fromIndex, int toIndex, long key)
    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
validateRange(a.length, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // static int binarySearch(short[] a, short key)
    public static int binarySearch(short[] a, short key) {
        return binarySearch(a, 0, a.length, key);
    }

    // static int binarySearch(short[] a, int fromIndex, int toIndex, short key)
    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        validateRange(a.length, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // static int binarySearch(T[] a, T key, Comparator c)
    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return binarySearch(a, 0, a.length, key, c);
    }

    // static int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator c)
    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        validateRange(a.length, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            int cmp = c.compare(a[mid], key);
            if (cmp < 0) {
                fromIndex = mid + 1;
            } else if (cmp > 0) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // Метод проверки диапазона
    private static void validateRange(int length, int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > length || fromIndex > toIndex) {
            throw new IllegalArgumentException("Invalid range: fromIndex=" + fromIndex + ", toIndex=" + toIndex);
        }
    }
}
