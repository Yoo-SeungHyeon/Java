package basic.com.helloshop.order;

import basic.com.helloshop.product.Product;
import basic.com.helloshop.user.User;

public class OrderService {
    public void order(){
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
