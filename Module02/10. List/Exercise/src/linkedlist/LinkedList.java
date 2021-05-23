package linkedlist;

public class LinkedList<E> {
  private Node head;
  private int numNodes = 0;

  public LinkedList() {
    head = null;
  }

  public LinkedList(Object data) {
    head = new Node(data);
  }

  public void add(int index, E element) {
    Node temp = head;

    for (int i = 0; i < index - 1 && temp.next != null; i++) {
      temp = temp.next;
    }

    Node newNode = new Node(element);
    newNode.next = temp.next;
    temp.next = newNode;

    numNodes++;
  }

  public void addFirst(E element) {
    Node newNode = new Node(element);

    newNode.next = head;
    head = newNode;

    numNodes++;
  }

  public void addLast(E element) {
    if (head == null) {
      addFirst(element);
    } else {
      Node newNode = new Node(element);
      Node temp = head;

      while (temp.next != null) {
        temp = temp.next;
      }

      temp.next = newNode;
      numNodes++;
    }
  }

  public E remove(int index) {
    if (index > numNodes || index < 0) {
      return null;
    } else {
      Node temp = head;
      for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
      }

      Node holder = temp.next;

      temp.next = holder.next;

      numNodes--;
      return (E) holder.getData();
    }
  }

  public boolean remove(Object element) {
    Node temp = head;
    Node newNode = new Node(element);

    for (int i = 0; i < numNodes; i++) {
      if (temp.next.getData() == newNode.getData()) {
        temp.next = temp.next.next;
        numNodes--;
        return true;
      } else {
        temp = temp.next;
      }
    }

    return false;

    //Dung vong while
//    while(temp.next!= null && temp.next.getData() != element){
//      temp = temp.next;
//    }
//    if (temp.next == null)
//        return false;
//    else{
//       temp.next = temp.next.next;
//      return true;
//    }
  }

  public int size() {
    return numNodes;
  }

  @SuppressWarnings("unchecked")
  public LinkedList<E> clone() {
    LinkedList<E> newLinkedList = new LinkedList<>();
    Node temp = head;
    for (int i = 0; i < numNodes; i++) {
      newLinkedList.addLast((E) temp);
    }
    return newLinkedList;
  }

  public boolean contains(Object element) {
    Node temp = head;

    while (temp.next != null && temp.next.getData() != element) {
      temp = temp.next;
    }

    return temp.next != null;
  }

  public int indexOf(E element) {
    Node temp = head;
    for (int i = 0; i < numNodes; i++) {
      if (temp == element) {
        return i;
      } else {
        temp = temp.next;
      }

    }
    return -1;
  }

  public boolean add(E element) {
    addLast(element);
    return true;
  }

  public E get(int i) {
    Node temp = head;
    for (int j = 0; j < numNodes; j++) {
      if (j == i) {
        return (E) temp.getData();
      } else {
        temp = temp.next;
      }
    }
    return null;
  }

  @SuppressWarnings("unchecked")
  public E getFirst() {
    return (E) head.getData();
  }

  public E getLast() {
    Node temp = head;
    for (int i = 0; i < numNodes - 1; i++) {
      temp = temp.next;

    }
    return (E) temp.getData();
  }

  public void clear() {
    head = null;
    numNodes = 0;
  }

  public void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
}
