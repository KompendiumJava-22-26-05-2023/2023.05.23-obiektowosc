package pl.comarch.szkolenia.obiektowosc;

import pl.comarch.szkolenia.obiektowosc.enkapsulacja.Square;

public class PorownywanieObiektow {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        System.out.println(a == b);
        Square s1 = new Square(5);
        Square s2 = new Square(7);

        System.out.println("TEST : " + s1.equals(s2));

        System.out.println(s1.getBok());
        System.out.println(s2.getBok());
        s1.setBok(10);
        System.out.println(s1.getBok());
        System.out.println(s2.getBok());
        System.out.println(s1.equals(s2));
        String str1 = "Janusz";
        String str2 = "Janusz";

        System.out.println(str1.equals(str2));

        Integer i1 = 5;
        Integer i2 = 5;

        System.out.println(i1.equals(i2));
        System.out.println(str1 == str2);

        str1 = str1 + "ABC";
        System.out.println(str1 == str2);
    }
}
