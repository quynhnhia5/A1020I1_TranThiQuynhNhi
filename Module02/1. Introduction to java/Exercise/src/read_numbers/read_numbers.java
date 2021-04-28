package read_numbers;

import java.util.Scanner;

public class read_numbers {
  //mang string nay se luu cach dem cua 20 so dau tien,
  String[] units = {
          "", //0
          "One", //1
          "Two", //2
          "Three", //3
          "Four", //4
          "Five",
          "Six",
          "Seven",
          "Eight",
          "Nine",
          "Ten",
          "Eleven",
          "Twelve",
          "Thirteen",
          "Fourteen",
          "Fifteen",
          "Sixteen",
          "Seventeen",
          "Eighteen",
          "Nineteen" //19
  };

  //de tuong tu nhu cai mang units o tren
  // tens de luu cach doc cho chu so hang chuc

  String[] tens = {
          "", // phan tu so thu 0
          "", //phan tu thu 1, dong nghia voi so 10, ma so 10  co dung o mang units o tren
          "Twenty", //pt thu 2, dong nghia voi so 20
          "Thirty",
          "Forty",
          "Fifty",
          "Sixty",
          "Seventy",
          "Eighty",
          "Ninety"
  };

  public String readNumber(int n) {
//    if ( number >1 && number <20 ){
//      System.out.print (" cach doc cua " + number + " la: " + units[number]);
//    }
//    else if( number >= 20 && number < 100){
//      System.out.print (" cach doc cua " + number + " la :" + tens[ number/10] + " "+ units[ number % 10]);
//    }
//    else if( number >= 100 && number < 1000){
//      if (number %100 ==0)
//        System.out.print ( " cach doc cua " + number + " la : " + hundred[ number / 100]);
//      else System.out.print ( " cach doc cua " + number + " la : " + hundred[ number / 100] + " and " + tens[ number % 100/10] + " "+ units[ number % 10 ]);
//    }
//    else if( number >= 1000 && number < 10000){
//      System.out.print( " cach doc cua " + number + " la : " + million[ number / 1000] + " " + hundred [ number % 1000/100] + " and " + tens[ number % 100 /10] + " "+ units[ number % 10 ]);
//    }

    if (n < 20)
      return units[n];

    if (n < 100)
      return tens[n / 10] + " " + units[n % 10];

    if (n < 1000)
      return units[n / 100] + " hundred" + ((n % 100 != 0) ? " and " + readNumber(n % 100) : "");

    if (n < 1000000)
      return readNumber(n / 1000) + " thousand " + readNumber(n % 1000);

    return "Out of ability";
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    read_numbers use = new read_numbers();

    System.out.print("Enter number: ");
    int number = scanner.nextInt();

    if (number == 0)
      System.out.println("Zero");
    else
      System.out.println(use.readNumber(number));
  }
}
