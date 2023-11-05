package Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    private Map<Customer, List<Products>> customerProducts;

    public ShoppingCart() {
        customerProducts = new HashMap<>();
    }
    //thêm đơn hàng vào danh sách đã mua hoặc mua
    public void addShoppingCart(Customer customer, Products product) {
        List<Products> products = customerProducts.getOrDefault(customer, new ArrayList<>());
        products.add(product);
        customerProducts.put(customer, products);
    }
    //in
    public void printCart(Customer customer) {
        List<Products> products = customerProducts.getOrDefault(customer, new ArrayList<>());
        for (Products product : products) {
            System.out.println(product.toString());
        }
    }
}
