package queue;

public class MyLinkedListQueue {
  private Node head;
  private Node tail;

  public MyLinkedListQueue() {
    this.head = null;
    this.tail = null;
  }

  public void enqueue(int key) {
    Node temp = new Node(key);

    //Them vao khi queue rong
    if (this.tail == null) {
      this.head = this.tail = temp;
      return;
    }

    //Them vao khi queue khong rong
    this.tail.next = temp;
    this.tail = temp;
  }

  public Node dequeue() {

    if (this.head == null)
      return null;

    Node temp = this.head;
    this.head = this.head.next;

    if (this.head == null)
      this.tail = null;

    return temp;
  }

}
