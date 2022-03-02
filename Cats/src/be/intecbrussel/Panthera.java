package be.intecbrussel;

public abstract class Panthera extends Animal{

    //constructors
    public Panthera(){

    }
    public Panthera(char size, char coat, String color, double weight){
        super(size, coat, color, weight);


    }

    //methods

    public String roar(){
        return "Raaaaaaaaaaawwr!";
    }
    public void hunt(){
        System.out.println("Cats of this genus are usually ambush hunters.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
