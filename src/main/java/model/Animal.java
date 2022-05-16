package model;

public class Animal implements Comparable<Animal> {
	String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "| " + name + " |";
    }

    public int compareTo(Animal input) {
        return this.name.compareTo(input.name);
    }
}