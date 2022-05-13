package solid.products;

import solid.interfaces.Clock;
import solid.interfaces.MusicPlayer;

public class Smartwatch extends Product implements Clock, MusicPlayer {
    private String name;
    private double price;
    private double rate;

    public Smartwatch(String name, double price, double rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;
    }

    @Override
    public void setAlarm(String time) {

    }

    @Override
    public void playMusic(String query) {

    }

    @Override
    public void print() {
        System.out.println("Название: " + name
                + ", цена: " + price
                + ", рейтинг: " + rate);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRate() {
        return rate;
    }
}
