package count;

import java.util.*;

public class Count {
  public static void main(String[] args) {
    HashMap<Character, Integer> charCount = new HashMap<>();


    Scanner sc = new Scanner(System.in);

    System.out.print("Enter string: ");
    String str = sc.nextLine().trim();

    //StringTokenizer stringTokenizer = new StringTokenizer(str, " ,.", false);

    for (int i = 0; i < str.length(); i++) {
//      if (charCount.containsKey(str.charAt(i))) {
//        charCount.put(str.charAt(i), charCount.get(str.charAt(i)) + 1);
//      } else {
//        charCount.put(str.charAt(i), 1);
//      }

      charCount.merge(str.charAt(i),1,Integer::sum);
    }

    for (Character character : charCount.keySet()) {
      System.out.println(character + " - " + charCount.get(character));
    }
    HashMap<String, Integer> wordCount = new HashMap<>();

    String[] words = str.split("\\s");

    for (String word : words) {
//      if (wordCount.containsKey(word)) {
//        wordCount.put(word, wordCount.get(word) + 1);
//      } else {
//        wordCount.put(word, 1);
//      }

      //method reference
      wordCount.merge(word,1,Integer::sum);
    }

    for (Map.Entry<String, Integer> stringIntegerEntry : wordCount.entrySet()) {
      System.out.println(stringIntegerEntry);

    }
  }
}

