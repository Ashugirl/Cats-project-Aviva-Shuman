package be.intecbrussel;

public class SiameseCat extends Felis{

    //constructors
    public SiameseCat() {
    }

    public SiameseCat(String name, int age, int shelterNo, int badgeNo) {
        setName(name);
        setAge(age);
        setShelterNo(shelterNo);
        setBadgeNo(badgeNo);
    }

    public SiameseCat(char size, char coat, String color, double weight, String name, int age, int shelterNo, int badgeNo) {
        setSize(size);
        setCoat(coat);
        setColor(color);
        setWeight(weight);
        setName(name);
        setAge(age);
        setShelterNo(shelterNo);
        setBadgeNo(badgeNo);

    }


    @Override
    public String toString() {
        return "\n\nThis cat is a " + getAge() + " year old Siamese Cat named "
                + getName() + ". Vital info: \nSize (Small, Medium, or Large): " +
                getSize() + "\nWeight in kgs: "
                + getWeight() + "\nCoat type(Long or Short): " + getCoat() + "\nColor: " + getColor() +
                "\nShelter number " + getShelterNo() + "; Badge number: " + getBadgeNo() + ".\n";
    }

}
