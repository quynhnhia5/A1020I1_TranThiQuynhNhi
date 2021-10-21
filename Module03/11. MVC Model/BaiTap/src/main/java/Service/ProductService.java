package Service;

import model.Product;

import java.util.List;

public interface ProductService {
  List<Product> findAll();
  void createProduct(int id,String name,int price,String description,String producer);
  void UpdateProduct(int id,String name,int price,String description,String producer);
  void deleteProduct(int id);
  Product searchProductById(int id);

  List<Product> searchProductByName(String name);

  void save(Product product);
}
