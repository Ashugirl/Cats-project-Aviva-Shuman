package be.intecbrussel;

public class TurkishVanCat extends Felis{
    //attributes
    public String nickname;

    //constructors

    public TurkishVanCat(){

    }

    public TurkishVanCat(String nickname) {
        this.nickname = nickname;
    }

    public TurkishVanCat(String name, int age, int shelterNo, int badgeNo, String nickname) {
        setName(name);
        setAge(age);
        setShelterNo(shelterNo);
        setBadgeNo(badgeNo);
        this.nickname = nickname;
    }

    public TurkishVanCat(char size, char coat, String color, double weight, String name, int age, int shelterNo, int badgeNo, String nickname) {
        setSize(size);
        setCoat(coat);
        setColor(color);
        setWeight(weight);
        setName(name);
        setAge(age);
        setShelterNo(shelterNo);
        setBadgeNo(badgeNo);
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "\n\nThis cat is a " + getAge() + " year old Turkish Van Cat named " + getName() + " although we usually call him " + nickname + ". Vital info: \nSize (Small, Medium, or Large): " + getSize() + "\nWeight in kgs: "
                + getWeight() + "\nCoat type(Long or Short): " + getCoat() + "\nColor: " + getColor() + "\nShelter number " + getShelterNo() + "; Badge number: " +getBadgeNo() + ".\n";
    }

}
