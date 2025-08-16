package EncapsulationOrAbstraction;

class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    String getName() {
        return name;
    }

    String getEmail() {
        return email;
    }

    char getGender() {
        return gender;
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    String getName() {
        return name;
    }

    Author getAuthor() {
        return author;
    }

    double getPrice() {
        return price;
    }

    int getQtyInStock() {
        return qtyInStock;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAuthor(Author author) {
        this.author = author;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}

public class BookTest {
    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling", "jk@hogwarts.com", 'F');
        Book book = new Book("Harry Potter and the Philosopher's Stone", author, 799.99, 100);

        System.out.println("Book Details:");
        System.out.println("Name: " + book.getName());
        System.out.println("Price: " + book.getPrice());
        System.out.println("Quantity in Stock: " + book.getQtyInStock());

        System.out.println("Author Details:");
        System.out.println("Name: " + book.getAuthor().getName());
        System.out.println("Email: " + book.getAuthor().getEmail());
        System.out.println("Gender: " + book.getAuthor().getGender());
    }
}