//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Author author = new Author("Теодор", "Драйзер");
        Author author1 = new Author("Айн", "Рэнд");
        Book book = new Book("Финансист", 1912, author);
        Book book1 = new Book("Атлант расправил плечи", 1957, author1);


        System.out.print(author.getFirstName() + " ");
        System.out.println(author.getLastName());

        System.out.println("Год публикации - " + book.getYearOfPublication());

        book.setYearOfPublication(1944);

        System.out.println("Год публикации - " + book.getYearOfPublication());

        System.out.println(book1.toString());
        System.out.println(book.toString());

        System.out.println(book.hashCode());

        System.out.println(author.equals(author1));
    }
}