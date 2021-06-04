package optional;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
  protected Node<E> root;
  protected int size = 0;

  public BST() {
  }

  public BST(E[] objects) {
    for (int i = 0; i < objects.length; i++)
      insert(objects[i]);
  }

  @Override
  public boolean insert(E e) {
    if (root == null)
      root = createNewNode(e); /*create a new root*/
    else {
      /*locate the parent node*/
      Node<E> parent = null;
      Node<E> current = root;
      while (current != null) {
        if (e.compareTo(current.element) < 0) {
          parent = current;
          current = current.left;
        } else if (e.compareTo(current.element) > 0) {
          parent = current;
          current = current.right;
        } else
          return false; /*Duplicate node not inserted*/
      }
      if (e.compareTo(parent.element) < 0)
        parent.left = createNewNode(e);
      else
        parent.right = createNewNode(e);
    }
    size++;
    return true; /*element inserted successfully*/
  }

  protected Node<E> createNewNode(E e) {
    return new Node<>(e);
  }

  @Override
  public int getSize() {
    return size;
  }

  @Override
  public void inorder() {
    inorder(root);
  }

  @Override
  public void postorder() {
    postorder(root);
  }

  @Override
  public void preorder() {
    preorder(root);
  }

  protected void inorder(Node<E> root) {
    if (root == null) return;
    inorder(root.left);
    System.out.println(root.element + " ");
    inorder(root.right);
  }

  protected void postorder(Node<E> root) {
    if (root == null) return;
    postorder(root.left);
    postorder(root.right);
    System.out.println(root.element + " ");

  }

  protected void preorder(Node<E> root) {
    if (root == null) return;
    System.out.println(root.element + " ");
    preorder(root.left);
    preorder(root.right);
  }
}

