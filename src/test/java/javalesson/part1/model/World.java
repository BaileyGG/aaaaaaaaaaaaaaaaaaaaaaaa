package javalesson.part1.model;

public class World {

    Human Jeff;
    Human Dan;
    Human David;

    void create() {
        Jeff = new Human("Jeff", (short) 16,54.4f,144.4f,true);
        Dan = new Human("Dan", (short) 17,78.4f,150f,true);
        David = new Human("David", (short) 20,88f,180f,true);
    }
}
