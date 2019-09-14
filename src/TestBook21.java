public class TestBook21 {
    public static void main(String[] args)
    {
        Author21 ahTeck = new Author21("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);

        Book21 dummyBook21 = new Book21("Java for dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBook21);

        dummyBook21.setPrice(29.95);
        dummyBook21.setQty(28);
        System.out.println("name is: " + dummyBook21.getName());
        System.out.println("price is: " + dummyBook21.getPrice());
        System.out.println("qty is: " + dummyBook21.getQty());
        System.out.println("Author is: " + dummyBook21.getAuthor());
        System.out.println("Author's name is: " + dummyBook21.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook21.getAuthor().getEmail());

        Book21 anotherBook21 = new Book21("more Java", new Author21("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook21);
    }
}
