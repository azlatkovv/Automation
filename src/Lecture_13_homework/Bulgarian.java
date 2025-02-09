package Lecture_13_homework;

public class Bulgarian extends Person {


    public Bulgarian(String EGN, String sex, String name, String religion, String languageSpoken, String job, String nationality, String countryOfresidence) {
        super(EGN, sex, name, religion, languageSpoken, job, nationality, countryOfresidence);}
    @Override
    public void whenItsNamesDay(){
        if (getName().equals("Ivan") && (getEGN().substring(2, 6)).equals("0107") ){
            System.out.println(getName() + " have name day and birthday on 7th of January.");
        }
        else if (getName().equals("Ivan")){
            System.out.println(getName() + " have name day on 7th of January.");
        }
    }



}
