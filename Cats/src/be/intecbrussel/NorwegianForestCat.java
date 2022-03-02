package be.intecbrussel;

public class NorwegianForestCat extends Felis{

    //constructors
    public NorwegianForestCat() {
    }

    public NorwegianForestCat(String name, int age, int shelterNo, int badgeNo) {
        setName(name);
        setAge(age);
        setShelterNo(shelterNo);
        setBadgeNo(badgeNo);
    }

    public NorwegianForestCat(char size, char coat, String color, double weight, String name, int age, int shelterNo, int badgeNo) {
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
    public void miauwInNorwegian(){
        System.out.println("Mjaaaaaauuu!");
    }


    @Override
    public String toString() {
        return "\n\nThis cat is a " + getAge() +
                " year old Norwegian Forest Cat named " + getName() +
                ". Vital info: \nSize (Small, Medium, or Large): " + getSize() + "\nWeight in kgs: "
                + getWeight() + "\nCoat type(Long or Short): " + getCoat() +
                "\nColor: " + getColor() + "\nShelter number " +
                super.getShelterNo() + "; Badge number: " +super.getBadgeNo()+ ".\n";

    }



}
