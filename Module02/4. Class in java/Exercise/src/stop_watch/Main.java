package stop_watch;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[] arr = new int[100000];

    Random rd = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rd.nextInt(1000);

    }
    StopWatch st = new StopWatch();
    st.start();
    Arrays.sort(arr);
    st.stop();
    System.out.println("Khoang thoi gian:" + st.getElapsedTime());


  }

}
