package pl.comarch.szkolenia.obiektowosc.enkapsulacja;

public class Enkapsulacja {

    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square.getBok());
        System.out.println(square.getObw());
        System.out.println(square.getPole());

        square.setBok(10);
        //square.bok = 10;

        System.out.println(square.getBok());
        System.out.println(square.getObw());
        System.out.println(square.getPole());

        //square.bok = 15;
        square.setBok(15);

        //square.bok = 34;
        square.setBok(34);

        //square.bok = 645;
        square.setBok(645);

        //square.bok = 45;
        square.setBok(45);

        //square.bok = 6;
        square.setBok(6);

    }
}
