package convert;

import java.util.Stack;

public class Decimal_Binary {
  public void convert(int number) {
    Stack<Integer> convert = new Stack<>();
    while(number>0){
      convert.push(number%2);
      number=number/2;
    }
    System.out.print("Decimal to Binary: ");
    while (!(convert.isEmpty())){
      System.out.print(convert.pop());
    }
  }
}
