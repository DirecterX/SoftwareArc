package book;


import java.util.List;

public class BookReader implements InterfaceReader{
    public static void main(String[] args) {
        BookReader bookreader = new BookReader();
        //Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        bookreader.printToScreen();
    }

    @Override
    public void printToScreen() {
        Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}
