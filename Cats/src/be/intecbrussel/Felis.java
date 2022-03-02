package be.intecbrussel;

import java.util.Objects;

public abstract class Felis extends Animal {


    //attributes
    private static int vaccinationCount = 1;
    private String name;
    private int age;
    private int shelterNo;
    private int badgeNo;

    {
        if (isAlive() == true) {
            vaccinationCount++;
        } else if (isAlive() == false) {
            vaccinationCount = vaccinationCount - 1;
        }
    }


    //constructors

    public Felis() {

    }

    public Felis(String name, int age, int shelterNo, int badgeNo) {
        this.name = name;
        this.age = age;
        this.shelterNo = shelterNo;
        this.badgeNo = badgeNo;
    }

    public Felis(char size, char coat, String color, double weight, String name, int age, int shelterNo, int badgeNo) {
        super(size, coat, color, weight);
        this.name = name;
        this.age = age;
        this.shelterNo = shelterNo;
        this.badgeNo = badgeNo;
    }

    //getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getShelterNo() {
        return this.shelterNo;
    }

    public void setShelterNo(int shelterNo) {
        this.shelterNo = Math.abs(shelterNo);
    }

    public int getBadgeNo() {
        return badgeNo;
    }

    public void setBadgeNo(int badgeNo) {
        this.badgeNo = Math.abs(badgeNo);
    }


    public static int getVaccinationCount() {
        return vaccinationCount;
    }

    public static void setVaccinationCount(int vaccinationCount) {
        Felis.vaccinationCount = vaccinationCount;
    }

    //methods


    public void miauw(){
        System.out.println("Meeeooww!");
    }

    public void miauw(int times){
        int i = times;
        for(i = 0; i <= times -1; i++){
            miauw();
        }
    }

    public static int getNoOfVaccinatedCats(){
        return vaccinationCount;
    }

    @Override
    public String toString() {
        return "Felis{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", shelterNo=" + shelterNo +
                ", badgeNo=" + badgeNo +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Felis)) return false;
        Felis felis = (Felis) o;
        return shelterNo == felis.shelterNo && badgeNo == felis.badgeNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shelterNo, badgeNo);
    }
}
