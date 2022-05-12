package solid;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Яблоко", 12.4, 4.9));
        productList.add(new Product("Груша", 23.2, 4.3));

        Shop shop = new Shop(productList, new Basket());
        shop.print();
        System.out.println();

        shop.addToBasket("Груша");
        shop.addToBasket("Яблоко");
        shop.basket.print();
        System.out.println();

        shop.removeFromBasket("Груша");
        shop.basket.print();
        System.out.println();

    }
}
