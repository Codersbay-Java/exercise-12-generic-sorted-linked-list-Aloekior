package application;

import list.SortedLinkedList;
import model.Animal;

public class Main {
    public static void main(String[] args) {
       /*
            test your implementation here
        */
        String apeName = "Affe";
        String catName= "Katze";
        String dogName = "Hund";

        Animal ape = new Animal(apeName);
        Animal cat = new Animal(catName);
        Animal dog = new Animal(dogName);

        SortedLinkedList<Animal> animalList = new SortedLinkedList<Animal>();
        animalList.insert(cat);
        animalList.insert(dog);
        animalList.insert(ape);

        System.out.println(animalList.toString());
        System.out.println(animalList.get(3));
        animalList.delete(1);
        System.out.println(animalList.toString());
    }
}