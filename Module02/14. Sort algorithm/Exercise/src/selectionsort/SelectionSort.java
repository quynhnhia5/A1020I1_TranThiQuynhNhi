package selectionsort;

public class SelectionSort {
  public static void sort(int [] arr){
    for (int i = 0; i < arr.length-1; i++) {
      int min=i;
      for (int j =i+1; j <arr.length ; j++) {
        if(arr[j]<arr[min]){
          min=j;
        }

      }

      int temp=arr[i];
      arr[i]=arr[min];
      arr[min]=temp;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) {
    int a[]={3,2,1,3,4};
    sort(a);
  }

}
