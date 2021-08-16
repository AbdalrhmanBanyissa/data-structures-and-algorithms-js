public class Main {
  public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5, 6}; // sample 1

//    int[] arr = {89, 2354, 3546, 23, 10, -923, 823, -12}; // sample 2

//    int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, // sample 3
//      41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
//      97, 101, 103, 107, 109, 113, 127, 131, 137, 139,
//      149, 151, 157, 163, 167, 173, 179, 181, 191, 193,
//      197, 199};

    System.out.println(Arrays.toString(reverseArray(arr)));


  }
  private static int[] reverseArray(int[] arr){
    int[] reverseArray = new int[arr.length];
    for (int i = arr.length - 1; i >= 0; i--){
      reverseArray[i] = arr[arr.length - i -1];
    }
    return reverseArray;
  }
}
