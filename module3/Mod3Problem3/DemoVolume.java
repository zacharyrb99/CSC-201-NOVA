package module3.Mod3Problem3;

public  class DemoVolume {
    public static void main(String[] args) {
        Book book1 = new Book("Ready Player One", "Ernest Cline", 374);
        Book book2 = new Book("Ready Player Two", "Ernest Cline", 366);

        Book[] books = {book1, book2};

        Volume volume1 = new Volume("Favorite Books", 2, books);
        System.out.println(volume1.toString());
    }
}
