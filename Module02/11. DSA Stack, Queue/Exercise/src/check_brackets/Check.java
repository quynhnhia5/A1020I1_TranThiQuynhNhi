package check_brackets;

import java.util.Stack;

public class Check {
  private String string;

  public Check(String string) {
    this.string = string;
  }

  public boolean checkBrackets() {
    Stack<Character> stack = new Stack<>();
    
    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == '(') {
        stack.push(string.charAt(i));
      } else if (string.charAt(i) == ')') {
        if (!stack.isEmpty()) {
          stack.pop();
        } else {
          return false;
        }
      }
    }

//    for (char c : string.toCharArray()) {
//      if (c == '(') {
//        stack.push(c);
//      } else if (c == ')') {
//        if (!stack.isEmpty()) {
//          stack.pop();
//        } else {
//          return false;
//        }
//      }
//    }
    
    return stack.isEmpty();
  }

}
