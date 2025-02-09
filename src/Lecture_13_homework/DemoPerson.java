package Lecture_13_homework;/*
Create different objects in the main class and use their methods.*/

public class DemoPerson {
    public static void main(String[] args) {
        Person Dido = new Person(
                "0510278086",
                "male",
                "Dido",
                "Hindo",
                "German",
                "IT",
                "Lecture13.Bulgarian",
                "Bulgaria");

//        System.out.println("Print date of birth: " + Dido.getDateOfBirth());
//        Dido.sayHello();
//        Dido.celebrateEaster();
//        Dido.isAdult();
//        System.out.println("Can " + Dido.getName() + " take a loan: " + Dido.canTakeLoan());


        Child Michael = new Child(
                "2120278086",
                "male",
                "Michael",
                "orthodox",
                "usa",
                "play",
                "Canada",
                "Canada");

        System.out.println("Print age of " + Michael.getName() + " " + Michael.getAge());
        System.out.println("Can child get loan: " + Michael.canTakeLoan());


        American Megan = new American(
                "0520278086",
                "female",
                "Megan",
                "catholic",
                "German",
                "",
                "Lecture13.American",
                "usa");
        System.out.println("Print age of "+ Megan.getName() + " " + Megan.getAge());
        System.out.println("Gender of the Lecture13.American is " + Megan.getSex());
        Megan.isAdult(); // Тук връща, че е adult. Не разбирам защо.


        Italian Ahmed = new Italian(
                "3510178246",
                "male",
                "Ahmed",
                "islam",
                "Turkish",
                "seller",
                "italian",
                "Turkish");
        Ahmed.traditionalDish();

        Bulgarian Ivan = new Bulgarian(
                "5501078246",
                "male",
                "Ivan",
                "orthodox",
                "Greek",
                "QA",
                "Lecture13.Bulgarian",
                "Greek");
        Ivan.whenItsNamesDay();

    }
}