package task2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        var cats = new ArrayList<ActiveCat>();

        cats.add(new ActiveCat(ActiveCat::jump));
        cats.add(new ActiveCat(ActiveCat::sleep));
        cats.add(new ActiveCat(ActiveCat::eat));

        cats.add(new ActiveCat(() -> "Я точу когти о диван!"));
        cats.add(new ActiveCat(() -> "Я бегаю за лазерной указкой!"));
        cats.add(new ActiveCat(() -> "Я смотрю в стену!"));

        cats.forEach(ActiveCat::doAction);
    }

}