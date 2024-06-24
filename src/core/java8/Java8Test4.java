package core.java8;

import java.util.Optional;

class CartService {
    public int getProductsCount() {
        return 2;
    }
}

interface PaymentService {
    void pay();

    default void calculate(double price) {

    }

    default int getProductsCount() {
        return 2;
    }
}

public class Java8Test4 {

    public static void main(String[] args) {
        CartService cs = new CartService();
        Optional<CartService> opt = Optional.ofNullable(cs);
        System.out.println("Cart count : " + opt.isPresent());
    }
}
