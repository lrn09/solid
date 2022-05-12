package solid;

import java.util.List;

public class Shop implements Printer {

    private List<Product> availableProducts;
    Basket basket;

    public Shop(List availableProducts, Basket basket) {
        this.availableProducts = availableProducts;
        this.basket = basket;

    }

    @Override
    public void print() {
        for (Product product : availableProducts) {
            System.out.println(product.toString());
        }
    }

    //LSP потому как в классе Шоп добавление просто по имени объекта, без описания его полей
    public void addToBasket(String name) {
        for (Product product : availableProducts) {
            if (product.getName().equals(name)) {
                basket.addToBasket(product);
            }
        }
    }

    //LSP потому как в классе Шоп удаление просто по имени объекта, без описания его полей
    public void removeFromBasket(String name) {
        for (Product product : availableProducts) {
            if (product.getName().equals(name)) {
                basket.removeFromBasket(product);
            }
        }
    }
}
