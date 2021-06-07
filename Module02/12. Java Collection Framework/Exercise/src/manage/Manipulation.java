package manage;

import java.util.*;

public class Manipulation {
  private ArrayList<Product> productList=new ArrayList<>();

  public void menu(){
    do {
      Scanner sc=new Scanner(System.in);
      System.out.println("MENU");
      System.out.println("1.Them san pham" +
              "\n"+ "2.Sua thong tin san pham" +
              "\n"+ "3.Xoa san pham" +
              "\n"+ "4.Hien thi danh sach san pham" +
              "\n"+ "5.Tim kiem san pham" +
              "\n"+ "6.Sap xep san pham ");
      System.out.print("You choice: ");
      int choice=sc.nextInt();
      switch (choice){
        case 1:
          addProduct();
          break;
        case 2:
          System.out.print("Enter id: ");
          int id=sc.nextInt();
          editProduct(id);
          break;
        case 3:
          System.out.print("Enter id you want delete: ");
          int ID=sc.nextInt();
          deleteProduct(ID);
          break;
        case 4:
          displayAllProductList();
          break;
        case 5:
          sc.nextLine();
          System.out.print("Enter the name you want to find: ");
          String name=sc.nextLine();
          System.out.println(findProduct(name));
          break;
        case 6:showProductByPrice();
          break;
      }

    }while (true);
  }

  public void addProduct(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter ID: ");
    int id=sc.nextInt();
    sc.nextLine();
    System.out.print("Enter name: ");
    String name=sc.nextLine();
    System.out.print("Enter price: ");
    int price=sc.nextInt();
    Product product=new Product(id,name,price);
    productList.add(product);
  }

  public void editProduct( int id){
    Scanner sc=new Scanner(System.in);
    for (Product product : productList) {
      if(product.getId()==id){
        do {
          System.out.println("You want to edit information ");
          System.out.println("1.Name" +
                  "\n"+ "2.Price" +
                  "\n"+ "3.Exit" );
          System.out.print("you choice: ");
          int choice=sc.nextInt();
          switch (choice){
            case 1:
              sc.nextLine();
              System.out.print("Enter change name: ");
              String name=sc.nextLine();
              product.setName(name);
              break;
            case 2:
              System.out.print("Enter change price: ");
              int price=sc.nextInt();
              product.setPrice(price);
              break;
            case 3:
              return;
          }
          System.out.println("Edit success");
        }while (true);
        }
    }
  }

  public void deleteProduct(int id){
    for (int i = 0; i < productList.size() ; i++) {

      if(productList.get(i).getId()==id){
        productList.remove(productList.get(i));
    }
      System.out.println("Delete success ");
    }
  }

  public void displayAllProductList(){
    for (Product product : productList) {
      System.out.println(product);
    }
  }

  public Product findProduct(String name){
    for (Product product : productList) {
      if(product.getName().equals(name)){
        return product;
      }
    }
    return null;
  }

  public void sortProductList(boolean order){

    Collections.sort(productList);
    if(!order){
      Collections.reverse(productList);
    }
    displayAllProductList();
  }

  public void showProductByPrice(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Product arrangements:");
    System.out.println("1.Tăng dần" +
            "\n"+"2.Giảm dần");
    System.out.print("You choice: ");
    int choice=sc.nextInt();
    switch (choice){
      case 1:
        sortProductList(true);
        break;
      case 2:
        sortProductList(false);
        break;
    }
  }
}
