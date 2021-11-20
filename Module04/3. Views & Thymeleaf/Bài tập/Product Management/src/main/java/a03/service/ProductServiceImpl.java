package a03.service;

import a03.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> productMap;

    static {

        productMap = new HashMap<>();
        productMap.put(1, new Product(1, "iphone", 10000000, "đẹp"));
        productMap.put(2, new Product(2, "samsung", 20000000, "xịn"));
        productMap.put(3, new Product(3, "laptop", 30000000, "hay"));

    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public void remove(int id) {
            productMap.remove(id);
    }
}
