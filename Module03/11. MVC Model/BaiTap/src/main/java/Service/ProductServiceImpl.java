package Service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
  public static List<Product> list=new ArrayList<>();
  static {
    list.add(new Product(1,"iphone",10000000,"đẹp","apple"));
    list.add(new Product(2,"samsung",8000000,"xịn","samsung"));
    list.add(new Product(3,"dell",30000000,"Tốt","dell"));
  }


  @Override
  public List<Product> findAll() {
    return list;
  }

  @Override
  public void createProduct(int id, String name, int price, String description, String producer) {
 list.add(new Product(id,name,price,description,producer));
  }

  @Override
  public void UpdateProduct(int id, String name, int price, String description, String producer) {

  }

  @Override
  public void deleteProduct(int id) {
    list.remove(id);

  }

  @Override
  public Product searchProductById(int id) {

    return list.get(id);
  }

  @Override
  public List<Product> searchProductByName(String name) {
    return list;
  }

  @Override
  public void save(Product product) {
  }
}
