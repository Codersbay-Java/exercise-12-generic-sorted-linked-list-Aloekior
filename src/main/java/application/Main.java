package application;

import list.SortedLinkedList;
import model.Animal;

public class Main {
    public static void main(String[] args) {
       /*
            test your implementation here
        */

        Animal cat = new Animal("Katze");
        Animal dog = new Animal("Hund");
        Animal monkey = new Animal("Affe");

        SortedLinkedList<Animal> animalList = new SortedLinkedList<Animal>();
        animalList.insert(cat);
        animalList.insert(dog);
        animalList.insert(monkey);

        System.out.println(animalList.toString());
        System.out.println(animalList.get(2));
        animalList.delete(1);
        System.out.println(animalList.toString());
        animalList.delete(0);
        System.out.println(animalList.toString());
    }
}