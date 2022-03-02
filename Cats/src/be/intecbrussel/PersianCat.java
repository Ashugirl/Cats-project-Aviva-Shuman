package be.intecbrussel;

public class PersianCat extends Felis{

    //constructors
    public PersianCat() {
    }

    public PersianCat(String name, int age, int shelterNo, int badgeNo) {
        setName(name);
        setAge(age);
        setShelterNo(shelterNo);
        setBadgeNo(badgeNo);
    }

    public PersianCat(char size, char coat, String color, double weight, String name, int age, int shelterNo, int badgeNo) {
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
    public int getShelterNo() {
        return super.getShelterNo();
    }

    @Override
    public void setShelterNo(int shelterNo) {
        super.setShelterNo(shelterNo);
    }

    //methods
    public void miauw(){
        System.out.println("Mrowww.");
    }

    @Override
    public String toString() {
        return "\n\nThis cat is a " + getAge() + " year old Persian Cat named " + getName()
                + ". Vital info: \nSize (Small, Medium, or Large): " + getSize() +
                "\nWeight in kgs: " + getWeight() + "\nCoat type(Long or Short): " + getCoat()
                + "\nColor: " + getColor() + "\nShelter number "
                + getShelterNo() + "; Badge number: " +getBadgeNo()+ ".\n";


    }



}

