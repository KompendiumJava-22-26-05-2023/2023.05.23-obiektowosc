package pl.comarch.szkolenia.obiektowosc;

public class Client {
    int id;
    String name;
    String surname;
    int age;
    long pesel;
    Address address;

    Client() {
        System.out.println("Tworzy sie obiekt klienta !!");
    }

    Client(int cos) {
        System.out.println(cos);
    }

    Client(int id, String name, String surname, int age, long pesel) {
        this(name, surname);
        this.id = id;
        this.age = age;
        this.pesel = pesel;
    }

    Client(String name, String surname) {
        this(5);
        this.name = name;
        this.surname = surname;
    }

    int add(int pierwszaLiczba, int drugaLiczba) {
        return pierwszaLiczba + drugaLiczba;
    }

    double add(double a, double b) {
        return a + b;
    }

    int cos() {
        return 7;
    }

    void powiedzImie() {
        System.out.println(this.name);
    }
}
