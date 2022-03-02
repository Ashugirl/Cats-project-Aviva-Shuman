package be.intecbrussel;

public abstract class Animal {
//Attributes
    protected static int animalCount;
    private char size;
    private char coat;
    private String color;
    private double weight;

    //counter increment
    {
        animalCount++;
    }

    //constructors
    public Animal(){

    }
    public Animal(char size, char coat, String color, double weight){
        this.size = size;
        this.coat = coat;
        this.color = color;
        this.weight = weight;
    }

    // getters and setters

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public char getCoat() {
        return coat;
    }

    public void setCoat(char coat) {
        this.coat = coat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static int getAnimalCount(){
        return animalCount;
    }

    //methods
    public void makeSound(String sound){
        System.out.println("This cat makes the following noise: " + sound);
    }

    public void eat(){
        System.out.println("Eats what it can catch.");
    }

    public void sleep(){
        System.out.println("Sleeps with one eye open.");
    }

    public boolean isAlive(){
        return true;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "size=" + size +
                ", coat=" + coat +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
