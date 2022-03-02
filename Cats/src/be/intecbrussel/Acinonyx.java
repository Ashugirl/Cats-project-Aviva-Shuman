package be.intecbrussel;

public abstract class Acinonyx extends Animal{
    //attributes
    private double speed;

    //constructors

    public Acinonyx(){

    }
    public Acinonyx(double speed) {
        this.speed = speed;
    }

    public Acinonyx(char size, char coat, String color, double weight, double speed) {
        super(size, coat, color, weight);
        this.speed = speed;
    }

    //getters and setters

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    //methods

    public void run(double distance){
        System.out.printf("Despite its incredible speed, the cheetah can only sprint around %.2f before needing to rest.", distance = .5);
    }

    public void kiauuww(){
        System.out.println("Kiaaaauuuwwww!");
    }

    @Override
    public String toString() {
        return "Acinonyx{" +
                "speed=" + speed +
                "} " + super.toString();
    }
}

