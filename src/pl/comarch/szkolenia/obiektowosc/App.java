package pl.comarch.szkolenia.obiektowosc;

public class App {
    public static void main(String[] args) {
        Client[] clients = new Client[100];

        int i = 4;
        Client c = new Client();
        Client c2 = new Client();

        c.id = 10;
        c.name = "Janusz";
        c.surname = "Kowalski";

        c2.id = 5;
        c2.name = "Karol";
        c2.surname = "Malinowski";

        System.out.println(c.id);
        System.out.println(c.name);
        System.out.println(c.surname);

        System.out.println(c2.id);
        System.out.println(c2.name);
        System.out.println(c2.surname);

        c.address = new Address();
        c.address.street = "Ogrodowa";
        c.address.code = "31-312";

        clients[0] = new Client();
        clients[1] = new Client();

        clients[0].id = 12;
        clients[1].name = "Wiesiek";

        System.out.println(c);

        System.out.println(clients[50]);

        Client c3 = new Client();
        System.out.println(c3.id);
        System.out.println(c3.name);
        System.out.println(c3.surname);
        System.out.println(c3.pesel);
        System.out.println(c3.age);
        System.out.println(c3.address);

        int wynikKlienta = c3.add(4, 7);
        System.out.println(wynikKlienta);
        wynikKlienta = c3.add(7, 15);
        System.out.println(wynikKlienta);

        c2.add(5,9);

        System.out.println(c2.cos());
        System.out.println(c3.cos());

        c.powiedzImie();
        c2.powiedzImie();

        c.add(4, 7);
        c.add(4.4, 6.6);

        System.out.println(c);

        Client c4 = new Client(5);
        Client c5 = new Client(1, "Szymon", "Jakis", 45, 234234);
        System.out.println(c5.id);
        System.out.println(c5.name);
        System.out.println(c5.surname);
        System.out.println(c5.age);
        System.out.println(c5.pesel);
    }
}
