package optional;

public class Node <E>{
  protected E element;
  protected Node<E> left;
  protected Node<E> right;

  public Node(E e) {
    element = e;
  }
}
