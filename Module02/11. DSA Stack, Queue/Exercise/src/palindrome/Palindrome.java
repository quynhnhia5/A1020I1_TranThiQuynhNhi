package palindrome;

import java.util.LinkedList;
import java.util.Queue;


public class Palindrome {
  private String string;

  public Palindrome(String string) {
    this.string = string;
  }

  public boolean palindrome() {
    Queue<Character> queue = new LinkedList<>();

    for (int i = string.length()-1; i >=0 ; i--) {
      queue.add(string.charAt(i));
    }

//    char[] chars = string.toCharArray();
//    for (char c : chars) {
//      queue.add(c);
//    }

    StringBuilder reverseString = new StringBuilder();
    while (!queue.isEmpty()){
      reverseString.append(queue.remove());
    }

    if(string.equals(reverseString.toString())){
      return true;
    }else
      return false;
  }

}
