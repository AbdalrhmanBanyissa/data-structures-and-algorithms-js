import java.util.*;

public class Main {

  public static void main(String[] args) {
    int arr[] = {-131, -82, 0, 27, 42, 68, 179};
    int key = 42;
    binarySearch(arr, key);

  }

  public static void binarySearch(int arr[], int key) {
    System.out.println("Input Array: " + Arrays.toString(arr));
    System.out.println("Key: " + key);
    Arrays.sort(arr);
    int first = 0;
    int last = arr.length - 1;
    int mid = (first + last) / 2;
    while (first <= last) {
      if (arr[mid] < key)
        first = mid + 1;
      else if (arr[mid] == key) {
        System.out.println("Key is found at index: " + mid);
        break;
      } else
        last = mid - 1;

      mid = (first + last) / 2;
    }

    if (first > last)
      System.out.println(-1);

  }
}
