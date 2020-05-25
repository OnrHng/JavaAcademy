package academy.everyonecodes.java.week2.set2.exercise1;

public class Application {
    public static void main(String[] args) {
        Article article = new Article("Picture Of Pluto", "Pluto is a “dwarf planet” – it is very small. " + "\n" +
                "A man discovered Pluto in 1930. Pluto is 7.2 billion kilometres from the earth. For a long time, " + "\n" +
                "we did not have good pictures of Pluto. Now, a spacecraft flies by. It takes great pictures.");
        Printer printer = new Printer();
        printer.print(article);
    }
}
