public class Main {
    public static void main(String[] args) {
        Food food = new Food("Roti", 10000, 250);
        Toy toy = new Toy("Mobil-mobilan", 50000, 3);
        Book book = new Book("Belajar Java", 80000, "Budi");

        System.out.println("=== FOOD ===");
        food.display();

        System.out.println("\n=== TOY ===");
        toy.display();

        System.out.println("\n=== BOOK ===");
        book.display();
    }
}