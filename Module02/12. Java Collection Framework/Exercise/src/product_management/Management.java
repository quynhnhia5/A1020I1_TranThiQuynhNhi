package product_management;

import java.util.*;

public class Management {
  private List<Product> list = new ArrayList<>();

  public void addProduct() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter ID: ");
    int id = scanner.nextInt();

//    while (isIDExist(id)){
//      System.out.println("ID da ton tai");
//      System.out.print("Enter ID: ");
//      id = scanner.nextInt();
//    }

    if(isIDExist(id)){
      System.out.println("ID da ton tai");
      return;
    }
    scanner.nextLine();
    System.out.print("Enter name: ");
    String name = scanner.nextLine();

    System.out.print("Enter price: ");
    int price = scanner.nextInt();

    Product newProduct = new Product(id,name, price);

    list.add(newProduct);
    System.out.println("Add successful");
  }

  public void editProduct(int id) {
    Scanner scanner = new Scanner(System.in);
    if (list.isEmpty()) {
      System.out.println("Khong ton tai san pham");
    } else {
      //Kiem tra ID ton tai
      if (!isIDExist(id)) {
        System.out.println("ID khong ton tai");
      } else {
        for (Product product : list) {
          if (product.getId() == id) {
            System.out.print("Re-enter name: ");
            String name = scanner.nextLine();
            System.out.print("Re-enter price: ");
            int price = scanner.nextInt();

            product.setName(name);
            product.setPrice(price);
          }
        }
        System.out.println("Edit successful");
      }
    }
  }

  public void delete(int id) {
    //Kiem tra list rong
    if (list.isEmpty()) {
      System.out.println("Khong ton tai san pham");
    } else {
      //Kiem tra ID ton tai
      if (!isIDExist(id)) {
        System.out.println("ID khong ton tai");
      } else {
        list.removeIf(product -> product.getId() == id);
        System.out.println("Delete successful");
      }
    }
  }

  public void showProduct() {
    if (list.isEmpty()) {
      System.out.println("Khong co san pham nao ");
    } else {

      for (Product product : list) {
        System.out.println(product.toString());
      }
    }
    //Lamda expression
//    list.forEach(product -> System.out.println(product.toString()));
  }

  public Product findProductByName(String name) {
    for (Product product : list) {
      if (product.getName().equals(name)) {
        return product;
      }
    }

    return null;
  }

  //order = true; Ascending
  //order = false; Descending
  public void showProductsByPrice(boolean order) {
    Collections.sort(list);

    if (!order) {
      Collections.reverse(list);
    }

    showProduct();
  }

  public void show() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Show tang dan hay giam dan");
    System.out.println("1. Tang dan");
    System.out.println("2. Giam dan");
    System.out.println("Your choice: ");
    int choice = sc.nextInt();

    if (choice == 1) {
      showProductsByPrice(true);
    } else {
      showProductsByPrice(false);
    }
  }

  public boolean isIDExist(int id) {
    for (Product product : list) {
      if (product.getId() == id) {
        return true;
      }
    }
    return false;
  }

}
