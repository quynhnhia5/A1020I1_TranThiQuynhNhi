public class test {
  interface Fish{}

  class Perch implements Fish {}

  static class Walleye { }

  static class Bluegill { }

  public static class Test{
    public static void main(String[] args) {
      Fish f = new Walleye();
      Walleye w = new Walleye();
      Bluegill b = new Bluegill();

      if(f instanceof Perch) System.out.println("f-p");
      if(w instanceof Fish) System.out.println("w-f");
      if(b instanceof Fish) System.out.println("b-f");
    }
  }
}
