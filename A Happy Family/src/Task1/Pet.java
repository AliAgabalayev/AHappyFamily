package Task1;

import java.util.Arrays;

public class Pet {
    public String species;
    public  String nikcname;
    public int  age;
    public int trickLevel;
    public String []habits;
    public void eat(){
        System.out.println("I'am eating");
    }
    public void respond(){
        System.out.println("Hello owner.I'am "+this.nikcname+"I miss you");
    }
    public void foul(){
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return "Task1.Pet{" +
                "species='" + species + '\'' +
                ", nikcname='" + nikcname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

    public Pet() {
    }

    public Pet(String nikcnamename,String species) {
        this.nikcname = nikcname;
        this.species=species;
    }

    public Pet(String species, String nikcname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nikcname = nikcname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }
}
