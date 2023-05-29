package pl.comarch.szkolenia.obiektowosc;

import pl.comarch.szkolenia.obiektowosc.enkapsulacja.Square;
import pl.comarch.szkolenia.obiektowosc.p.Car;
import java.util.Random;
import pl.comarch.szkolenia.obiektowosc.model.Client;

public class Pakiety {
    public static void main(String[] args) {
        Address address = new Address();
        Car car = new Car();
        car.cos();

        pl.comarch.szkolenia.obiektowosc.model.Car car2
                = new pl.comarch.szkolenia.obiektowosc.model.Car();

        Random random = new Random();
        Client client = new Client();

        Square square = new Square(5);
        //square.obw = 5;
    }
}
