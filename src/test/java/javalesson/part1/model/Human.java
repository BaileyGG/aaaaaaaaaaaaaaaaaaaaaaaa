package javalesson.part1.model;

class Human {
    String name;
    short age;
    float weight;
    float height;
    boolean alive;

    void showTheWorldMyAge(){
        System.out.println("I am "+age+"years old.");
    }

    public Human(String name, short age, float weight, float height, boolean alive) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.alive = alive;
    }
}
