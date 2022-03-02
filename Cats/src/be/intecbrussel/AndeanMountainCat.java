package be.intecbrussel;

public class AndeanMountainCat extends Felis{

    //constructors
    public AndeanMountainCat() {
    }

    public AndeanMountainCat(String name, int age, int shelterNo, int badgeNo) {
        setName(name);
        setAge(age);
        setShelterNo(shelterNo);
        setBadgeNo(badgeNo);
    }

    public AndeanMountainCat(char size, char coat, String color, double weight, String name, int age, int shelterNo, int badgeNo) {
        setSize(size);
        setCoat(coat);
        setColor(color);
        setWeight(weight);
        setName(name);
        setAge(age);
        setShelterNo(shelterNo);
        setBadgeNo(badgeNo);
    }

    //methods

    public void miauw(String customSound){
        System.out.println(customSound);
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public String toString() {
        return "\n\nThis cat was an Andean Mountain cat. This cat is no more. This is an ex cat.\n";
    }


    }

