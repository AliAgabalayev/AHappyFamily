package Task2;

import java.util.Arrays;

public class Pet {
   private String species;
    private  String nikcname;
    private int  age;
    private int trickLevel;
    private String []habits;
    private void eat(){
        System.out.println("I'am eating");
    }
    private void respond(){
        System.out.println("Hello owner.I'am "+this.nikcname+"I miss you");
    }
    private void foul(){
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNikcname() {
        return nikcname;
    }

    public void setNikcname(String nikcname) {
        this.nikcname = nikcname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }
}
