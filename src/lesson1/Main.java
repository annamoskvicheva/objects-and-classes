package lesson1;

import lesson1.Author;

public class Main {
    public static void main(String[] args) {
        Author dostoevskiy = new Author("Фёдор", "Достоевский");
        //System.out.println(author.getFirstName());
        //System.out.println(author.getLastName());
        Author gogol = new Author("Николай", "Гоголь");
        Book mertvyeDushi = new Book("Мёртвые души", gogol, 1852);

        Book prestuplenieAndNakazanie = new Book("Преступление и наказание", dostoevskiy, 1866);
        System.out.println(prestuplenieAndNakazanie.getName());
        System.out.println(prestuplenieAndNakazanie.getYear());
        prestuplenieAndNakazanie.setYear(1866);
        System.out.println(prestuplenieAndNakazanie.getYear());

        System.out.println(mertvyeDushi.getName());
        System.out.println(mertvyeDushi.getYear());
        mertvyeDushi.setYear(1866);
        System.out.println(mertvyeDushi.getYear());





    }
}