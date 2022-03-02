package be.intecbrussel;

import java.util.Arrays;

public class CatApp {
    public static void main(String[] args) {


        PersianCat persianCat = new PersianCat('M', 'L', "red", 4, "Ginger", 6, 21, 218);
        NorwegianForestCat norwegianForestCat = new NorwegianForestCat('L', 'L', "tabby", 9.5, "Floofmonster", 4, 21, 218);
        SiameseCat siameseCat = new SiameseCat('S', 'S', "seal point", 3.5, "Huck", 2, 35, 311);
        TurkishVanCat turkishVanCat = new TurkishVanCat('M', 'M', "white", 6, "Tulum", 3, 114, 28, "Stinky");
        AndeanMountainCat andeanMountainCat = new AndeanMountainCat();
        SiameseCat siameseCat1 = new SiameseCat('S', 'S', "lilac point", 3.8, "Finn", 2, 114, 29);
        NorwegianForestCat norwegianForestCat1 = new NorwegianForestCat('L', 'L', "red and white", 10, "Katt", 6, -28, 101);

        Felis[] felis = new Felis[7];
        felis[0] = persianCat;
        felis[1] = norwegianForestCat;
        felis[2] = siameseCat;
        felis[3] = turkishVanCat;
        felis[4] = andeanMountainCat;
        felis[5] = siameseCat1;
        felis[6] = norwegianForestCat1;

        CatApp.printCats(felis);


        System.out.println();
        System.out.println("Ginger says: "); persianCat.miauw();
        System.out.println("\nKatt says: "); norwegianForestCat1.miauwInNorwegian();
        System.out.println("\nHuck and Finn say:"); siameseCat.miauw(5);
        System.out.println("\nZombie Andean Mountain Cat says: "); andeanMountainCat.miauw("Hssssssssssss");
        System.out.println();

        System.out.println("The number of animals is: " + Animal.getAnimalCount());
        System.out.println("The number of vaccinated cats is: " + Felis.getNoOfVaccinatedCats());
        System.out.println();

        System.out.println("Ginger and Floofmonster are the same cat: " +persianCat.equals(norwegianForestCat));
        System.out.println("Ginger and Huck are the same cat: " + persianCat.equals(siameseCat));

    }


   private static void printCats(Felis[] felis) {
       System.out.println(Arrays.toString(felis));

       }
    }

