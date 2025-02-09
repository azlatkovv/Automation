package Lecture_13_homework;

public class American extends Person {
    public American(String EGN, String sex, String name, String religion, String languageSpoken, String job, String nationality, String countryOfresidence) {
        super(EGN, sex, name, religion, languageSpoken, job, nationality, countryOfresidence);
    }

    // getAge polymorphism logic is to check the 3rd number of the EGN and if it is = 2 then do other calculations because the goal is to be Lecture13.Child at age 20

    @Override
    public int getAge() {
        String ageEGNString = getEGN().substring(0, 2);
        String checkIsItChild = getEGN().substring(2, 3);
        int currentYear = 2025;
        int ageEGNInt;
        if (checkIsItChild.equals("2")) {
            ageEGNInt = Integer.parseInt("20" + ageEGNString);
        } else {
            ageEGNInt = Integer.parseInt("19" + ageEGNString);
        }

        return currentYear - ageEGNInt;
    }




}
