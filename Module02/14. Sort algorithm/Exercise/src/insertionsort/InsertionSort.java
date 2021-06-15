package insertionsort;

public class InsertionSort {
  static void sort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int sort = arr[i];
      int j = i - 1;

      for (; j >= 0 && arr[j] > sort; j--) {
        arr[j + 1] = arr[j];
      }
      arr[j + 1] = sort;
    }

    for (int value : arr) {
      System.out.println(value);
    }
  }

  public static void main(String[] args) {
    int[] a = {2, 6, 1, 3, 2, 1};
    sort(a);
  }
}
