package task1;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);

        cats.sort((c1, c2) -> c1.getBreed().compareTo(c2.getBreed()));
        Printer.print(cats);

        cats.sort(Comparator.comparing(Cat::getName).thenComparing(Cat::getAge));
        Printer.print(cats);

        cats.removeIf(Cat::isColorGray);
        Printer.print(cats);

        cats.removeIf(c -> c.getName().length() == 5);
        Printer.print(cats);
    }

}