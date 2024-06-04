import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();

        Author Jack = new Author("Jack", "Epping");
        Book Reflextion = new Book("Рефлексия",Jack, currentYear);
        System.out.println("Автора книги - " + Reflextion.getName() + " зовут " + Jack.getName() + " " + Jack.getMiddleName() + ", год издания книги " + Reflextion.getPublicYear());
        Reflextion.setPublicYear(2015);
        System.out.println("Автора книги - " + Reflextion.getName() + " зовут " + Jack.getName() + " " + Jack.getMiddleName() + ", год издания книги " + Reflextion.getPublicYear());


        Author Dwayne = new Author("Dwayne", "Johnson");
        Book MuscleMan = new Book("Качок", Dwayne, currentYear);

        Author Danya = new Author("Danya", "Slyusarev");
        Book MillitaryEducation = new Book("Военное обучение", Danya, currentYear);


    }
}