package list;

public class MyListTest {
  public static void main(String[] args) {
    MyList<Integer> list = new MyList<>();
    list.add(3);
    list.add(2);
    list.add(4);
    list.add(3);
    list.remove(2);
    System.out.println(list.indexOf(2));
    // MyList<Integer> list2= new MyList<>();
    //list2=list.clone();
    //list.clear();
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
    System.out.println(list.getLength());
    list.ensureCapacity(6);
    System.out.println(list.getLength());
//    for (int i = 0; i <list2.size(); i++) {
//      System.out.println(list2.get(i));
//    }
  }
}
