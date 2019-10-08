package Book21;

import Author21.Author;

public class TestBook {
    public static void main(String[] args)
    {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);

        Book dummyBook21 = new Book("Java for dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBook21);

        dummyBook21.setPrice(29.95);
        dummyBook21.setQty(28);
        System.out.println("name is: " + dummyBook21.getName());
        System.out.println("price is: " + dummyBook21.getPrice());
        System.out.println("qty is: " + dummyBook21.getQty());
        System.out.println("Author is: " + dummyBook21.getAuthor());
        System.out.println("Author's name is: " + dummyBook21.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook21.getAuthor().getEmail());

        Book anotherBook21 = new Book("more Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook21);
    }
}
