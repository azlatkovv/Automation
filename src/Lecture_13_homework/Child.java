package Lecture_13_homework;

import java.util.Objects;

// First i should fix get age logic with polymorphism, because to be Lecture13.Child, it should be born after 2004 for USA and 2007 for Europe
public class Child extends Person {
    public Child(String EGN, String sex, String name, String religion, String languageSpoken, String job, String nationality, String countryOfresidence) {
        super(EGN, sex, name, religion, languageSpoken, job, nationality, countryOfresidence);
    }

// getAge polymorphism logic is to check the 3rd number of the EGN and if it is = 2 then do other calculations
    @Override
    public int getAge() {
        String ageEGNString = getEGN().substring(0,2);
        String checkIsItChild = getEGN().substring(2,3);
        int currentYear = 2025;
        int ageEGNInt;
        if(checkIsItChild.equals("2")){
             ageEGNInt = Integer.parseInt("20"+ageEGNString);
        }else {
             ageEGNInt = Integer.parseInt("19" + ageEGNString);
        }
        return currentYear - ageEGNInt;

    }
    @Override
    public boolean canTakeLoan() {
        return !Objects.equals(getJob(), "play");
    }
}
