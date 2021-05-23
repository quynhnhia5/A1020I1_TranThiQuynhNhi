package linkedlist;
public class LinkedListTest {
  public static void main(String[] args) {
    LinkedList<Integer> linked = new LinkedList<>();
    linked.add(2);
    linked.add(3);
    linked.add(4);

    linked.addFirst(1);
    linked.addLast(5);
    System.out.println(linked.remove((Integer)4));

    linked.printList();
    System.out.println("Last: " + linked.getLast());
    System.out.println("get: " + linked.get(2));
  }

}
