package Task1;

import java.util.Arrays;

public class Human {
   public String name;
    public String surname;
    public int year;
    public int iq;
    public Pet pet;
    public Human father;
    public  Human mother;
    public String schedule[][];

    public void greetPet(){
        System.out.printf("Hello,%s\n",pet.nikcname);
    }
    public void describePet(){
        System.out.print("I have a"+pet.species+"he is"+pet.age+"years old,he is"+" ");
    if (pet.trickLevel>50){
        System.out.print("very sly");
    }
    else System.out.println("almost sly");
    }

    @Override
    public String toString() {
        return "Task1.Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", father=" + father +
                ", mother=" + mother +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human father, Human mother, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.father = father;
        this.mother = mother;
        this.schedule = schedule;
    }

    public Human() {
    }

    public Human(String name,String surname,int year) {
        this.name = name;

        this.surname=surname;

        this.year=year;
    }
    public Human(String name,String surname,int year,Human father,Human mother) {
        this.name = name;
        this.surname=surname;
        this.year=year;
        this.father=father;
        this.mother=mother;
    }

}
