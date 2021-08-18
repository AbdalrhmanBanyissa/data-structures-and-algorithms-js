import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] testArray = {2,4,6,-8};

    System.out.println(Arrays.toString(insertShiftArray(testArray,5)));

  }
  public static int[] insertShiftArray (int[] arr,int x){
    int[] outputArray = new int[arr.length +1];

    int position;

    if (arr.length % 2 == 0)
      position = arr.length/2 +1;
    else
      position = arr.length/2 +2;

    for (int i = 0; i < arr.length +1; i++){
      if (i < position - 1)
        outputArray[i] = arr[i];
      else if (i == position - 1 )
        outputArray[i] = x;
      else
        outputArray[i] = arr[i - 1];
    }
    return outputArray;
  }
}
