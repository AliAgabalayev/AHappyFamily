package Task1;

public class Main {
    public static void main(String[] args) {
        Pet cat = new Pet();
        cat.species = "Cat";
        cat.nikcname = "Cat1";
        cat.age = 2;
        cat.trickLevel = 49;
        cat.habits = new String[]{"jump", "run"};
        Pet dog = new Pet("Dog1", "Dog");
        Pet rabbit = new Pet("Rabbit", "Rabbit1", 2, 51, new String[]{"jump", "eat"});
        Human father = new Human("Father", "Father1", 1980);
        Human mother = new Human("Mother", "Mother1", 1982);
        Human child = new Human("Child", "Child1", 2004, 145, dog, father, mother, new String[][]{{"Monday", "Reading book"}, {"Saturday", "Writing code"}});
        child.greetPet();
        child.describePet();
        dog.eat();
        dog.respond();
        dog.foul();
    }
}
