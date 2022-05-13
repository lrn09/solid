package solid;

import solid.products.Apple;
import solid.products.Product;
import solid.products.Smartphone;
import solid.products.Smartwatch;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Product> productList = new ArrayList<>();
        productList.add(new Apple("Сезонные", 4.55, 4.9));
        productList.add(new Smartphone("iPhone", 999.99, 3.5));
        productList.add(new Smartwatch("MiBand 5", 14.99, 4.6));

        Shop shop = new Shop(productList, new CashRegister("IBM", 9_990, 4.9));
        shop.print();
        System.out.println();

        shop.addToBasket("iPhone");
        shop.addToBasket("iPhone");
        shop.addToBasket("Сезонные");
        shop.basket.print();
        System.out.println();

        shop.removeFromBasket("iPhone");
        shop.basket.print();
        System.out.println();

        shop.buy();
        shop.basket.print();
        System.out.println();

        shop.repeatPreviousPurchase();
        shop.basket.print();

    }
}
