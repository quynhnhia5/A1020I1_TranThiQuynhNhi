package read_numbers;

import java.util.Scanner;

public class read_numbers {
  public static void main(String[] args) {
    int number, tru, chia, tru2, tram, chuc, donvi;
    Scanner scanner = new Scanner(System.in);
    System.out.print(" input number:");
    number = scanner.nextInt();
    System.out.print("Change:");
    if ((number <= 10) && (number > 0)) {
      switch (number) {
        case 0:
          System.out.print("one");
          break;
        case 1:
          System.out.print("One");
          break;
        case 2:
          System.out.print("Two");
          break;
        case 3:
          System.out.print("Three");
          break;
        case 4:
          System.out.print("Four");
          break;
        case 5:
          System.out.print("Five");
          break;
        case 6:
          System.out.print("Six");
          break;
        case 7:
          System.out.print("Seven");
          break;
        case 8:
          System.out.print("Eight");
          break;
        case 9:
          System.out.print("Nine");
          break;
        case 10:
          System.out.print("Ten");
          break;
        default:
          System.out.print("out of ability");
          break;
      }

    } else if (number <= 20 && number > 10) {
      tru = number - 10;
      switch (tru) {
        case 1:
          System.out.print("Eleven");
          break;
        case 2:
          System.out.print("Twelve");
          break;
        case 3:
          System.out.print("Thirteen");
          break;
        case 4:
          System.out.print("Fourteen");
          break;
        case 5:
          System.out.print("Fifteen");
          break;
        case 6:
          System.out.print("Sixteen");
          break;
        case 7:
          System.out.print("Seventeen");
          break;
        case 8:
          System.out.print("Eighteen");
          break;
        case 9:
          System.out.print("Nineteen");
          break;
        case 10:
          System.out.print("Twenty");
          break;

      }


    } else if (number > 20 && number < 100) {
      chuc = number / 10;
      donvi = number % 10;
      switch (chuc){
        case 2:
          System.out.print("Twenty-");
          switch (donvi){
              case 0:
                System.out.print("one");
                break;
              case 1:
                System.out.print("One");
                break;
              case 2:
                System.out.print("Two");
                break;
              case 3:
                System.out.print("Three");
                break;
              case 4:
                System.out.print("Four");
                break;
              case 5:
                System.out.print("Five");
                break;
              case 6:
                System.out.print("Six");
                break;
              case 7:
                System.out.print("Seven");
                break;
              case 8:
                System.out.print("Eight");
                break;
              case 9:
                System.out.print("Nine");
                break;
              case 10:
                System.out.print("Ten");
                break;

          }
          break;
        case 3:
          System.out.print("Thirty-");
          switch (donvi) {
            case 0:
              System.out.print("");
              break;
            case 1:
              System.out.print("One");
              break;
            case 2:
              System.out.print("Two");
              break;
            case 3:
              System.out.print("Three");
              break;
            case 4:
              System.out.print("Four");
              break;
            case 5:
              System.out.print("Five");
              break;
            case 6:
              System.out.print("Six");
              break;
            case 7:
              System.out.print("Seven");
              break;
            case 8:
              System.out.print("Eight");
              break;
            case 9:
              System.out.print("Nine");
              break;
            case 10:
              System.out.print("Ten");
              break;
      }
      break;

      }
    } else if (number > 100 && number < 1000) {
      tram = number / 100;
      chuc = number % 100 / 10;
      donvi = number % 10;
      switch (tram){
        case 1:
          System.out.print("one hundred and ");
          switch (chuc){
            case 0:
              switch (donvi){
                case 1:
                  System.out.print("One");
                  break;
                case 2:
                  System.out.print("Two");
                  break;
                case 3:
                  System.out.print("Three");
                  break;
                case 4:
                  System.out.print("Four");
                  break;
                case 5:
                  System.out.print("Five");
                  break;
                case 6:
                  System.out.print("Six");
                  break;
                case 7:
                  System.out.print("Seven");
                  break;
                case 8:
                  System.out.print("Eight");
                  break;
                case 9:
                  System.out.print("Nine");
                  break;

              }
              break;
            case 1:
              switch (donvi){
                case 1:
                  System.out.print("Eleven");
                  break;
                case 2:
                  System.out.print("Twelve");
                  break;
                case 3:
                  System.out.print("Thirteen");
                  break;
                case 4:
                  System.out.print("Fourteen");
                  break;
                case 5:
                  System.out.print("Fifteen");
                  break;
                case 6:
                  System.out.print("Sixteen");
                  break;
                case 7:
                  System.out.print("Seventeen");
                  break;
                case 8:
                  System.out.print("Eighteen");
                  break;
                case 9:
                  System.out.print("Nineteen");
                  break;

              }
              break;

          }
        case 2:
          System.out.print("two hundred and ");
          switch (chuc){
            case 0:
              switch (donvi){
                case 1:
                  System.out.print("One");
                  break;
                case 2:
                  System.out.print("Two");
                  break;
                case 3:
                  System.out.print("Three");
                  break;
                case 4:
                  System.out.print("Four");
                  break;
                case 5:
                  System.out.print("Five");
                  break;
                case 6:
                  System.out.print("Six");
                  break;
                case 7:
                  System.out.print("Seven");
                  break;
                case 8:
                  System.out.print("Eight");
                  break;
                case 9:
                  System.out.print("Nine");
                  break;

              }
              break;
            case 1:
              switch (donvi){
                case 1:
                  System.out.print("Eleven");
                  break;
                case 2:
                  System.out.print("Twelve");
                  break;
                case 3:
                  System.out.print("Thirteen");
                  break;
                case 4:
                  System.out.print("Fourteen");
                  break;
                case 5:
                  System.out.print("Fifteen");
                  break;
                case 6:
                  System.out.print("Sixteen");
                  break;
                case 7:
                  System.out.print("Seventeen");
                  break;
                case 8:
                  System.out.print("Eighteen");
                  break;
                case 9:
                  System.out.print("Nineteen");
                  break;

              }
              break;

          }


      }


    }
  }


}
