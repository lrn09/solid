package solid.products;

import solid.interfaces.Clock;
import solid.interfaces.MusicPlayer;
import solid.interfaces.SMS;

public class Smartphone extends Product implements Clock, SMS, MusicPlayer {

    private String name;
    private double price;
    private double rate;

    public Smartphone(String name, double price, double rate) {
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
    public void sendSMS(String msg, String number) {

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
