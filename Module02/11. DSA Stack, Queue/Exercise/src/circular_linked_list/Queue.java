package circular_linked_list;

public class Queue {
  private Node front;//đầu
  private Node rear;//cuối

  public Queue() {
    this.front = null;
    this.rear = null;
  }

  public void enqueue(int data) {
    Node newNode = new Node(data);
    if (front == null) {
      front = rear = newNode;
    } else {
      rear.link = newNode;
      rear = newNode;
    }
    rear.link = front;
  }

  public Integer dequeue() {
    if (front == null) {
      return null;
    }
    Node temp = front;

    if (front == rear) {
      front = rear = null;
    } else {
      front = front.link;
      rear.link = front;
    }
    return temp.data;
  }


  public void displayQueue() {
    if (front == null) {
      System.out.println("null");
    } else {
      Node temp = front;

      do {
        System.out.print(temp.data + " ");
        temp = temp.link;
      } while (temp != front);
    }
  }


}


