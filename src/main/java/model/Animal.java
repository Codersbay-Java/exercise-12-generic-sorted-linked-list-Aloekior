package model;

public class Animal implements Comparable<Animal> {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "| " + name + " |";
    }

    public int compareTo(Animal other) {
        return name.compareTo(other.name);
    }
}