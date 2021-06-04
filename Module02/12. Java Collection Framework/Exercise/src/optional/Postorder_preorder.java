package optional;

public class Postorder_preorder {
  public static void main(String[] args) {
    //create a BST
    BST<Integer> tree = new BST<>();
    tree.insert(25);
    tree.insert(15);
    tree.insert(50);
    tree.insert(10);
    tree.insert(22);
    tree.insert(35);
    tree.insert(70);
    tree.insert(4);
    tree.insert(12);
    tree.insert(18);
    tree.insert(24);
    tree.insert(31);
    tree.insert(44);
    tree.insert(66);
    tree.insert(90);
    //traverse tree
    System.out.println("Postorder (sorted): ");
    tree.postorder();
    System.out.println("Inorder (sorted): ");
    tree.inorder();
    System.out.println("Preorder (sorted): ");
    tree.preorder();
    System.out.println("The number of nodes is: " + tree.getSize());
  }
}
