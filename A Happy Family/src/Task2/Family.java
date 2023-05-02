package Task2;

import java.util.Arrays;

public class Family {
   private   Human mother=new Human();
    private Human father=new Human();
     private Human[] children;
     private  Pet pet=new Pet();

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }
   public  Family(Human mother,Human father){
   children=new Human[0];
    }
    public void greetPet(){
        System.out.printf("Hello,%s\n", pet.getNikcname());
    }
    public void describePet(){
        System.out.print("I have a"+ pet.getSpecies() +"he is"+ pet.getAge() +"years old,he is"+" ");
        if (pet.getTrickLevel() >50){
            System.out.print("very sly");
        }
        else System.out.println("almost sly");
    }
    public void addChild(Human child){

        Human[] newChildren = new Human[children.length + 1];

        for (int i = 0; i < children.length; i++) {
            newChildren[i] = children[i];
        }

        newChildren[children.length] = child;

        child.setFamily(this);

        children = newChildren;
    }
    public boolean deleteChild(int index){
        if (index < 0 || index >= children.length) {
            return false;
        }
        Human[] newChildren = new Human[children.length - 1];
        for (int i = 0, j = 0; i < children.length; i++) {
            if (i != index) {
                newChildren[j] = children[i];
                j++;
            }
        }

        children = newChildren;
        return true;
    }
    int countFamily=2+children.length;

}
