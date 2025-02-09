package Lecture_13_homework;

public class Italian extends Person {
    public Italian(String EGN, String sex, String name, String religion, String languageSpoken, String job, String nationality, String countryOfresidence) {
        super(EGN, sex, name, religion, languageSpoken, job, nationality, countryOfresidence);
    }
@Override
    public void traditionalDish (){

        if (getNationality().equals("italian")){
            System.out.println("Traditional dish of the italians is: Pasta");

        }else{
            System.out.println("We don't know the " + getNationality() + " traditional Dish.");

        }





    }

}
